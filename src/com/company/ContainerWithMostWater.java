package com.company;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int area =0;
        int max=0,min=0;
        while(i<j){
            area = Math.max(area,
                    Math.min(height[i], height[j]) * (j - i));
            if(height[i]<height[j])
                i += 1;
            else
                j -= 1;

        }
        return area;
    }
}
