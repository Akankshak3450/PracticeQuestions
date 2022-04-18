package com.company;
import java.util.Scanner;
public class LessThanOrEqualToKTogether {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
    }
    public static void lessOrEqualTo(int[] arr, int n,int k){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=k){
                arr[j]= arr[i];
            }
        }
    }
}
