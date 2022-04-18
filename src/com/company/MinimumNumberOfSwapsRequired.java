package com.company;

import java.util.Scanner;

public class MinimumNumberOfSwapsRequired {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        minSwaps(arr);
    }
    public static int minSwaps(int nums[]) {
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
        while (low < high) {
            if (nums[low] > nums[high]) {
                int t = nums[low];
                nums[low] = nums[high];
                nums[high] = t;
                count++;
                low++;
            }
        }
        System.out.println(count);
        return count;
    }
}
