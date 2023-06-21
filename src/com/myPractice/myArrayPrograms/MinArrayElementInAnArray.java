package com.myPractice.myArrayPrograms;

import java.util.Scanner;

public class MinArrayElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < num; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int min = arr[arr.length-1];
        System.out.println("Min element are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min=arr[i];
        }
        System.out.println(min);
    }
}
