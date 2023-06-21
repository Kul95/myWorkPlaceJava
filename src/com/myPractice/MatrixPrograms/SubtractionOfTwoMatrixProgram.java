package com.myPractice.MatrixPrograms;

import java.util.Scanner;

public class SubtractionOfTwoMatrixProgram {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr3[][]=new int[3][3];
        System.out.println("First array:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Second array:");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(" "+arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Subtraction of array :");
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
    arr3[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(" "+arr3[i][j]);
            }
            System.out.println();
        }
    }
}
