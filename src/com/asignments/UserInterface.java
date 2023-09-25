package com.asignments;

import java.util.*;
class CustomerDetails {
    private String customerName;
    private long phoneNumber;
    private String address;

    public CustomerDetails(String customerName, long phoneNumber, String address) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

abstract class Bero {
    protected String beroType;
    protected String beroColour;
    protected double price;

    public Bero(String beroType, String beroColour) {
        this.beroType = beroType;
        this.beroColour = beroColour;
    }

    public abstract void calculatePrice();

    // Getter and setter methods
    public String getBeroType() {
        return beroType;
    }

    public void setBeroType(String beroType) {
        this.beroType = beroType;
    }

    public String getBeroColour() {
        return beroColour;
    }

    public void setBeroColour(String beroColour) {
        this.beroColour = beroColour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class SteelBero extends Bero {
    private int beroHeight;

    public SteelBero(String beroType, String beroColour, int beroHeight) {
        super(beroType, beroColour);
        this.beroHeight = beroHeight;
    }

    @Override
    public void calculatePrice() {
        if (beroHeight == 3) {
            price = 5000;
        } else if (beroHeight == 5) {
            price = 8000;
        } else if (beroHeight == 7) {
            price = 10000;
        }
    }

    public int getBeroHeight() {
        return beroHeight;
    }

    public void setBeroHeight(int beroHeight) {
        this.beroHeight = beroHeight;
    }
}

class WoodenBero extends Bero {
    private String woodType;

    public WoodenBero(String beroType, String beroColour, String woodType) {
        super(beroType, beroColour);
        this.woodType = woodType;
    }

    @Override
    public void calculatePrice() {
        switch (woodType.toLowerCase()) {
            case "ply wood" -> price = 15000;

            case "teak wood" -> price = 12000;

            case "engineered wood"->  price = 10000;
        }
    }


    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
}

class Discount {
    public double calculateDiscount(Bero bObj) {
        if (bObj instanceof SteelBero) {
            return (bObj.getPrice() * 10) / 100;
        } else if (bObj instanceof WoodenBero) {
            return (bObj.getPrice() * 15) / 100;
        } else {
            return 0;
        }
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String customerName = scanner.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter address");
        String address = scanner.nextLine();

        CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, address);


        System.out.println("Enter Bero Type");
        String beroType = scanner.nextLine();

        // Process based on bero type
        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = scanner.nextInt();

            SteelBero steelBero = new SteelBero(beroType, beroColour, beroHeight);
            steelBero.calculatePrice();

            Discount discountCalculator = new Discount();
            double discount = discountCalculator.calculateDiscount(steelBero);
            double totalPrice = steelBero.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = scanner.nextLine();

            WoodenBero woodenBero = new WoodenBero(beroType, beroColour, woodType);
            woodenBero.calculatePrice();

            Discount discountCalculator = new Discount();
            double discount = discountCalculator.calculateDiscount(woodenBero);
            double totalPrice = woodenBero.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else {
            System.out.println(beroType + " is an invalid bero type");
        }

    }
}
// OUTPUT
//    Enter Customer Name
//        Rohit
//    Enter Phone Number
//        69696969696
//        Enter address
//        rohit@gmail.com
//Enter Bero Type
//        Wooden Bero
//        Enter Bero Colour
//        Brown
//        Enter Wood Type
//        Ply Wood
//        Amount needs to be paid 12750.00