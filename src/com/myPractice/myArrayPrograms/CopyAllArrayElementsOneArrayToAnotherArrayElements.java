package com.myPractice.myArrayPrograms;

import java.util.Scanner;

public class CopyAllArrayElementsOneArrayToAnotherArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr1[]=new int[num];
        int arr2[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();

        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.println();
        System.out.println("Copy array elements:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
    }
}
