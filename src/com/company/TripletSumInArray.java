package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for(int i=0;i<n-1;i++){
            int j = i+1;
            int k = n-1;
            while(k>j){
                if(A[i]+A[j]+A[k] == X){
                    return true;
                }else if(A[i]+A[j]+A[k]<X){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return false;

    }
}
