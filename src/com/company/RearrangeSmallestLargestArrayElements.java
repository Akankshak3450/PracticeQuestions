package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeSmallestLargestArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange(arr,n);
    }
    public static void Rearrange(int arr[],int n){

        int temp[] = new int[n];
        Arrays.sort(arr);
        int c=0;
        int i=0;
        int d=n-1;
        int j=0;
        while(i<n){
            if(i%2==0){
                temp[i] = arr[c];
                c++;
            }else{
                temp[i] = arr[d-j];
                j++;
            }
            i++;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(temp[k]+"  ");
        }
    }
}
