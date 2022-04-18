package com.company;

import java.util.Scanner;

public class MaximumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxIndexDiff(arr,n);
    }

    public static int maxIndexDiff(int A[], int N) {
        int max = 0;
        for (int j = 0; j < N; j++) {
            for (int k = N-1; k >=j ; k--) {
                if(A[j]<=A[k]){
                    max = Math.max(max,k-j);
                    break;
                }
            }
        }
        System.out.println(max);
        return max;
    }
}