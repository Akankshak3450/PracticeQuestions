package com.company;

import java.util.Scanner;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter data for array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rearrange(arr,n);
    }
    public static void rearrange(int[] arr, int n){
        int temp =0;
        int h=0;
        while(h<n) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            h++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        /*
        Another Solution Optimized way
        // If Array elements is not equal to 0 then store data in another array
        int j=0;
        for(int i=0;i<n;i++){
           if(arr[i] !=0){
               arr[j] =arr[i];
               j++;
           }
       }
       // Making remaining elements as 0
       for(int i=j;i<n;i++){
           arr[i] = 0;
       }
         */

    }
}
