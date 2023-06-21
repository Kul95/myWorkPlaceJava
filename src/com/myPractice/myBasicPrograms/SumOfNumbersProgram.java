package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class SumOfNumbersProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of numbers are :"+sum);
    }
}
