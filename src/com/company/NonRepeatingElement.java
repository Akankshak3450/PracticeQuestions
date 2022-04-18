package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        NonRepeating(arr,n);
    }
    public static void NonRepeating(int arr[],int n){

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for (int i = 0; i < n; i++) {
            if(hm.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }

    }
}
