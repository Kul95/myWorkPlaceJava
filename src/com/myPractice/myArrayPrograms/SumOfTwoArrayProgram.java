package com.myPractice.myArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrayProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int arr1[]=new int[num];
        int arr2[]=new int[num];
        int arr3[]=new int[num];

        System.out.println("Enter the first array elements:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("First Array:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
        System.out.println("Enter the second array elements:");
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        System.out.println("Second Array:");
        for(int j=0;j<num;j++){
            System.out.print(" "+arr2[j]);
        }
        System.out.println();
        System.out.println("Sum of arrays are:");
        if(arr1.length==arr2.length){
            for(int i=0,j=0,k=0;i<arr1.length;i++,j++,k++){
                arr3[k]=arr1[i]+arr2[j];
            }
            System.out.println(Arrays.toString(arr3));
        }
    }
}
