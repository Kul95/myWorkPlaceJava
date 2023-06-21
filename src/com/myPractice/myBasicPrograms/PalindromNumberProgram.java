package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class PalindromNumberProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(num+" : is palindrome number:");
        }else{
            System.out.println(num+ " : is Not a palindrome number...");
        }
    }
}
