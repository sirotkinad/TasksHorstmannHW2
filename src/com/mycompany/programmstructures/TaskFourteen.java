package com.mycompany.programmstructures;

/*Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters
a blank line.*/

import java.util.Scanner;

public class TaskFourteen {

    public static void main(String[] args) {
         int[][] arr = getMatrix();
         System.out.println(isMagicSquare(arr));

    }

    public static int[][] getMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter dimension: ");
        int n = Integer.parseInt(s.nextLine());
        int[][] matrix = new int[n][n];
        System.out.println("Enter " + n + " lines, separate numbers in the same line with whitespace");
        int i = 0;
        while(true){
            String str = s.nextLine();
            if(str.length() == 0)
                break;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
            i++;
        }
        return matrix;
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int rowSum = checkRows(matrix);
        int colSum = checkColumns(matrix);
        int diagSum = checkDiagonals(matrix);
        return (rowSum >= 0 && rowSum == colSum && rowSum == diagSum);
    }

    public static int checkRows(int[][] matrix) {
        int firstRowSum = 0, rowSum = 0;
        for (int j = 0; j < matrix.length; j++) {
            firstRowSum += matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != firstRowSum)
                return -1;
            else
                rowSum = 0;
        }
        return firstRowSum;
    }

    public static int checkColumns(int[][] matrix){
        int firstColSum = 0, colSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            firstColSum += matrix[i][0];
        }
        for (int j = 1; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != firstColSum)
                return -1;
            else
                colSum = 0;
        }
        return firstColSum;
    }

    public static int checkDiagonals(int[][] matrix){
        int diag1 = 0, diag2 = 0;
        for(int i = 0; i < matrix.length; i++){
            diag1 += matrix[i][i];
            diag2 += matrix[i][matrix.length - 1 - i];
        }
        if(diag1 == diag2){
            return diag1;
        }
        else{
            return -1;
        }
    }
}
