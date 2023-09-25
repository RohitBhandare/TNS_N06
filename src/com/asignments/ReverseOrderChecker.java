package com.asignments;

import java.util.Scanner;

public class ReverseOrderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of numbers
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();

        // Input the numbers said by Pinky
        System.out.println("Numbers said by Pinky");
        int[] pinkyNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = scanner.nextInt();
        }

        // Input the numbers said by Mary
        System.out.println("Numbers said by Mary");
        int[] maryNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            maryNumbers[i] = scanner.nextInt();
        }

        // Check if Mary's numbers are in reverse order
        boolean isReverseOrder = true;
        for (int i = 0; i < n; i++) {
            if (maryNumbers[i] != pinkyNumbers[n - 1 - i]) {
                isReverseOrder = false;
                break;
            }
        }

        // Output the result
        if (isReverseOrder) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }

        scanner.close();
    }
}
