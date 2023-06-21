package com.myPractice.myArrayPrograms;
import java.util.Scanner;
public class SimpleArrayProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the number:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is :");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
