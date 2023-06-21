package com.myPractice.MatrixPrograms;

import java.util.Scanner;

public class MatrixPrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4},{6,7,8,9},{2,4,7}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

    }
}
