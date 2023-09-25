package com.threadsync;

import java.util.Arrays;
import java.util.stream.IntStream;

record demo(int id) {

}
public class Practice {

    final static int a=10;
    public static void main(String[] args) {
        demo obj=new demo(12);

        int arr[]= {1,2,8,4,5,5,5,6};

        int n = 3; // Replace with the desired value of n

        int nthLargest = IntStream.of(arr)
                .distinct()
                .sorted()
                .boxed() // Convert to Stream<Integer>
                .skip(3) // Skip the first (arr.length - n) elements
                .findFirst() // Get the first (and only) remaining element
                .orElse(-1); // Default value if not found

        System.out.println("The " + n + "th largest element is: " + nthLargest);



//        // second largest element
//
//
//        int first=0;
//        int second=0;
//        int third=0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] > first) {
//                third = second;
//                second = first;
//                first = arr[i];
//            } else if (arr[i] > second && arr[i] != first) {
//                third = second;
//                second = arr[i];
//            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
//                third = arr[i];
//            }
//
//
//        }
//        System.out.println("Second largest element: " + second);
//        System.out.println("Third largest element: " + third);

    }
}
