package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class SquarRootProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        double num=sc.nextDouble();
        System.out.println(Math.sqrt(num));
    }
}
