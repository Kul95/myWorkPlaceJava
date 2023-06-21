package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class SwapTwoNumberProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Before swapping program: "+num1+" and "+num2);

        //1. Using temporary variable........
//        int temp=num1;
//        num1=num2;
//        num2=temp;

        // 2.  Using Addition operator.....
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;


        // 3. Using Compliment operator......
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After swapping program : "+num1+ " and "+num2);
    }
}
