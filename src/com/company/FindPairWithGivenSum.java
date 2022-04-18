package com.company;

import java.util.Scanner;

public class FindPairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        FindSum(arr,n,sum);
    }
    public static boolean FindSum(int arr[],int n,int sum){
        int temp =0;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            for (int j = i+1; j <n ; j++) {
                if(temp+arr[j] == sum){
                    System.out.println("true");
                 return true;
                }
            }
        }
        System.out.println("False");
        return false;
    }
}
