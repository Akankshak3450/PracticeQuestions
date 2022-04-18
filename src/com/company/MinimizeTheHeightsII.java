package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeightsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k : ");
        int k = sc.nextInt();
        System.out.println(mini(arr,n ,k));
    }
    public static int mini(int arr[],int n,int k){
        for (int i = 0; i < n; i++) {
            if(arr[i]-k<0){
                arr[i] = arr[i]+k;
            }else{
                arr[i] = arr[i]-k;
            }
        }
        Arrays.sort(arr);
        return (arr[n-1]-arr[0]);
    }
}
