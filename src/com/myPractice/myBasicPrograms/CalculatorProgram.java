package com.myPractice.myBasicPrograms;

import java.util.Scanner;

public class CalculatorProgram {
    public static void addition(int x, int y) {
        System.out.println("Addition = " + (x + y));
    }

    public static void subtraction(int x, int y) {
        System.out.println("Subtraction = " + (x - y));
    }

    public static void multiplication(int x, int y) {
        System.out.println("Multiplication = " + (x * y));
    }

    public static void division(int x, int y) {
        System.out.println("Division = " + (x / y));
    }

    public static void mod(int x, int y) {
        System.out.println("Mod = " + (x % y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            System.out.println("press... 1.Addition / 2.Subtraction / 3.Multiplication  / 4.Division /  5.Mode");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> addition(a, b);

                case 2 -> subtraction(a, b);

                case 3 -> multiplication(a, b);

                case 4 -> division(a, b);

                case 5 -> mod(a, b);

                default -> System.out.println("Invalid.");

            }
            System.out.println("Press 0 to exit...");
            i = sc.nextInt();

        } while (i != 0);
        sc.close();
    }
}
