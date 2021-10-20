package com.bridgelabz.uc3;

import java.util.Scanner;

public class EuclideanDistance {

    public static void Distance(int x, int y) {
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("The Euclidean Distance of the point from origin is : " + distance);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the co-ordinates x : ");
        int x = sc.nextInt();
        System.out.print("Enter the co-ordinates y : ");
        int y = sc.nextInt();
        Distance(x,y);
    }
}
