package com.bridgelabz.uc1;

import java.util.Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of 2D array: ");
        int x=scanner.nextInt();
        int y= scanner.nextInt();

        int[][] arr = new int[x][y];

        System.out.println("Enter the " + x*y + " items of the 2D array");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int k=0;k<y;k++)
            System.out.println(Arrays.toString(arr[k]));
    }
}
