package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        String x=(num1>num2)?"num1 is greatest":"Num2 is greatest number";
        System.out.println(x);
    }
}
