package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"|  ");
        }
        int turns;
        System.out.println("Reversed ---------------");
        do{
            turns = sc.nextInt();
            int temp = arr[n-1];
              for(int i=n-1;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + "|  ");
             }
        }while (turns !=0);
    }
}
