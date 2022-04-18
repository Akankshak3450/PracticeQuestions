package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFormSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no. of elements in array : ");
        int n1 = sc.nextInt();
        int arr1[] =new int[n1];
        System.out.print("\nEnter elements in array : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        removeDuplicates(arr1,n1);
    }
    public static void removeDuplicates(int[] arr, int n){
       Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"  ");

        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
