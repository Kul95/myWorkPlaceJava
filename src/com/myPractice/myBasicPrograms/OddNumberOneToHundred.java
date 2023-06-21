package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class OddNumberOneToHundred {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(" "+i);
            }
        }
    }
}
