package com.myPractice.myArrayPrograms;

import java.util.Scanner;

public class EvenArrayElementProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array elements: ");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Even array elements:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
