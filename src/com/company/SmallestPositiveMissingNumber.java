package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MissingNumber(arr,n);
    }
    static int MissingNumber(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int i = 1; i < n+2; i++) {
            if(!hs.contains(i)){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }
}
