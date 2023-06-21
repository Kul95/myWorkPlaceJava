package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class PrimeNumberBetweenOneToHundredProgram {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int num = 100;
        int count = 0;
        for (int num = 0; num <= 100; num++) {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if (count == 0) {
                    System.out.print(" "+num);
                }
            }
        }
    }

