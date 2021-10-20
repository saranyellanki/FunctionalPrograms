package com.bridgelabz.uc2;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfThreeInt {
    static void findTriplets(int[] arr, int n)
    {
        int numberOfDistinctTriples = 0;
        boolean found = false;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]+" ");
                        System.out.print(arr[j]+" ");
                        System.out.print(arr[k]+" "+"\n");
                        numberOfDistinctTriples++;

                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println(" not exist ");
        }
        System.out.println("number of distinct triples = "+numberOfDistinctTriples);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of integers in the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Enter the integer values in the array: ");
        for (int i=0; i<N;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        findTriplets(array, N);
    }
}
