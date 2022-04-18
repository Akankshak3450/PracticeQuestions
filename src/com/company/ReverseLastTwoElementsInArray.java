package com.company;

import java.util.*;
public class ReverseLastTwoElementsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StartEndCount s = new StartEndCount();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        s.SECount(arr,m,n);
    }

}
//1, 3, 5, 5, 5, 5, 67, 123, 125