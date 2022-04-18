package com.company;

import java.util.Scanner;

public class SplitTheArrayAndAddtoEnd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Splitting into : ");
        int k = sc.nextInt();
        splitAndAdd(arr,n,k);
    }
    public static void splitAndAdd(int arr[],int n,int k){
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        if (n - k >= 0) System.arraycopy(arr, k, arr, k - k, n - k);
        System.out.print("\nTemp   ");
        for (int value : temp) {
            System.out.print(value + "  ");
        }
        System.out.print("\nArr   ");
        for (int i = 0; i < arr.length-k; i++) {
            System.out.print(arr[i]+"  ");
        }
        int j =n-k;
        int t=0;
        while(j<n){
            arr[j] = temp[t];
            j++;t++;
        }
        System.out.println("Split And Rotated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}

