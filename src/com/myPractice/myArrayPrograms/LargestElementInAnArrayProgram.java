package com.myPractice.myArrayPrograms;

import java.util.Scanner;

public class LargestElementInAnArrayProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array input:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Original Array are : ");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        int max=arr[0];
        System.out.println("Max array elements:");
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max)
                    max=arr[i];
                }
//            int max=arr[0];
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]>max)
//                    max=arr[i];
//            }
            System.out.print(max);
            }
        }


