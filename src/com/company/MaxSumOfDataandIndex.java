package com.company;

import java.util.Scanner;

public class MaxSumOfDataandIndex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MaxSum(arr,n);

    }
    public static void MaxSum(int arr[],int n){
        int i=0;
        int sum=0;
        for (int j = 0; j < n; j++) {
            sum += arr[j]*j;
        }

        while(i<n){
            int temp = arr[0];
            for (int j = 1; j <n ; j++) {
                arr[j-1] = arr[j];
            }
            int max=0;
            arr[n-1] = temp;
            for(int k=0;k<n;k++){
                max += arr[k]*k;
            }
            if(sum<max){
                sum = max;
            }
            i++;
        }
        System.out.println(sum);





//        int sum=0;
//        for (int j = 0; j < n; j++) {
//            sum += arr[j]*j;
//        }
//        int i=0;
//        while(i<n){
//            int temp = arr[0];
//            for (int j = 1; j < n; j++) {
//                arr[j-1] = arr[j];
//            }
//            arr[n-1] = temp;
//            int max = 0;
//            for (int j = 0; j < n; j++) {
//                max += arr[j]*j;
//            }
//            if(sum<max){
//                sum = max;
//            }
//            i++;
//        }
//
//        System.out.println(sum);

    }
}
