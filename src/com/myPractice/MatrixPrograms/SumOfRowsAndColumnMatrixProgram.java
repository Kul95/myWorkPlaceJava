package com.myPractice.MatrixPrograms;

public class SumOfRowsAndColumnMatrixProgram {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix Array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        int sumRow=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sumRow=sumRow+arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row ."+sumRow);
        }
        int colRow=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                colRow=colRow+arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row"+colRow);
        }
    }
}
