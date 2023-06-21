package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class PrimeNumberProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                count++;
            }
            if(count==0){
                System.out.println("Prime number...");
            }else{
                System.out.println("Not a prime number..");
            }
        }
    }
}
