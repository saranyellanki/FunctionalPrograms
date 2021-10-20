package com.bridgelabz.uc4;

import java.util.Scanner;

public class QuadraticEquation {

    public static void  Roots(int a, int b, int c){

        double mod = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(mod))/(2*a);
        double root2 = (-b - Math.sqrt(mod))/(2*a);
        System.out.println("The roots for the quadratic equation are : " +root1+ " and " +root2);

    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficient a of the quadratic equation : ");
        int a = scanner.nextInt();
        System.out.print("Enter the coefficient b of the quadratic equation : ");
        int b = scanner.nextInt();
        System.out.print("Enter the coefficient c of the quadratic equation : ");
        int c = scanner.nextInt();

        Roots(a,b,c);

    }
}
