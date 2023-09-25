package com.threadsync;

class Account {
    private int accountId;
    private String accountHolder;
    private double balance;

    public Account(int accountId, String accountHolder, double initialBalance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " is waiting for sufficient balance to withdraw: " + amount);
            try {
                wait(); // Wait for deposit to increase the balance
                System.out.println(Thread.currentThread().getName() + " has been notified and will retry withdrawal.");
                withdraw(amount); // Retry withdrawal after being notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        notify(); // Notify waiting threads that the balance has increased
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", accountHolder=" + accountHolder + ", balance=" + balance + "]";
    }
}

class AccountThread extends Thread {
    private Account account;
    private double amount;
    private String type;

    public AccountThread(Account account) {
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        if ("withdraw".equals(type)) {
            account.withdraw(amount);
        }
    }
}

public class BankService {

    public static void main(String[] args) {
        Account accObj = new Account(101, "Rutvik", 100);
        System.out.println("---------Account Details-------");
        System.out.println(accObj);

        AccountThread threadOne = new AccountThread(accObj);
        AccountThread threadTwo = new AccountThread(accObj);

        threadOne.setAmount(2000);
        threadOne.setType("withdraw");

        threadTwo.setAmount(8000);
        threadTwo.setType("withdraw");

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(accObj);
    }
}
