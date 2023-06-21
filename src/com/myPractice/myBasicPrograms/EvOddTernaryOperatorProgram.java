package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class EvOddTernaryOperatorProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        String str=(num%2==0)?"Even Number":"Odd Number";
        System.out.println(str);
    }
}
