package com.company;

import java.util.Scanner;

public class MinimumSwapsAndKTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter data for array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        MinimumSwaps(arr,n,k);
    }
    public static void MinimumSwaps(int arr[],int n,int k){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"  ");
        }
        int i=0;
        int j = n-1;
        int count=0;
        while(i<j){
            if(arr[i]<k){
                i++;
            }else if(arr[j]>k){
                j--;
            }else if(arr[i]>k && arr[j]<k){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                count++;
            }

        }


        for (int l = 0; l < n; l++) {
            System.out.print(arr[l]+"  ");
        }
        System.out.println(count);
    }
}
