package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class ArmstrongNumberProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        int arm=0;
        int rem;
        while(temp>0){
            rem=temp%10;
            arm=arm+(rem*rem*rem);
            temp=temp/10;
        }
        if(num==arm){
            System.out.println(num+" : is armstrong number.");
        }else{
            System.out.println(num+" :Not a armstrong number.");
        }
    }
}
