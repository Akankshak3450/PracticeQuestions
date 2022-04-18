package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        segregateEvenOdd(arr,n);
    }
    public static void segregateEvenOdd(int arr[], int n) {
        Arrays.sort(arr);

        int ev = 0, od = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                ev++;
            } else {
                od++;
            }
        }
        int even[] = new int[ev];
        int odd[] = new int[od];
        int index = 0;
        int indf = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[index] = arr[i];
                index++;
            }
        }
        System.out.println("EVEN __________________");
        for (int i = 0; i < ev; i++) {
            System.out.print(even[i]+"  ");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                odd[indf] = arr[i];
                indf++;
            }
        }
        System.out.println("ODD -------------------");
        for (int i = 0; i < od; i++) {
            System.out.print(odd[i]+"  ");
        }
        int temp[] = new int[n];
        int k = 0;
        for (int i = 0; i < ev; i++) {
            temp[k++] = even[i];
        }
        for (int i = 0; i < od; i++) {
            temp[k++] = odd[i];
        }
        System.out.println("RESULT _________________");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+"  ");
        }
    }
}
