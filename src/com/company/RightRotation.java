package com.company;

import java.util.Scanner;

public class RightRotation {
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
        Right(arr,n,k);
    }
    public static void Right(int arr[],int n , int k){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        for (int i = 0; i < k; i++) {
            int temp = arr[n-1];
            for (int j = n-1; j >0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println("Rotated array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }


    }
}
