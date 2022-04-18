package com.company;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no. of elements in array 1 : ");
        int n1 = sc.nextInt();
        int arr1[] =new int[n1];
        System.out.print("\nEnter elements in array 1 : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter no. of elements in array 2 : ");
        int n2 = sc.nextInt();
        int arr2[] =new int[n2];
        System.out.print("\nEnter elements in array 2 : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------");
        System.out.print("\nDisplaying array 1 :");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i]+"  ");
        }
        System.out.print("\nDisplaying array 2 :");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i]+"  ");
        }
        int ch =0;
        do {
            System.out.println("--------------------------------");
            System.out.println("\n1)Sorting of arrays \n2)Union f the array \n3)Intersection \n5)Difference\n4)Symmetric");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                for (int i = 0; i < n1 - 1; i++) {
                    for (int j = 0; j < n1 - i - 1; j++) {
                        if (arr1[j] > arr1[j + 1]) {
                            int temp = arr1[j];
                            arr1[j] = arr1[j + 1];
                            arr1[j + 1] = temp;
                        }
                    }
                }
                System.out.print("\nSorted array 1 :");
                for (int i = 0; i < n1; i++) {
                    System.out.print(arr1[i] + "  ");
                }
                for (int i = 0; i < n2 - 1; i++) {
                    for (int j = 0; j < n2 - i - 1; j++) {
                        if (arr2[j] > arr2[j + 1]) {
                            int temp = arr2[j];
                            arr2[j] = arr2[j + 1];
                            arr2[j + 1] = temp;
                        }
                    }
                }
                System.out.print("\nSorted array 2 : ");
                for (int i = 0; i < n2; i++) {
                    System.out.print(arr2[i] + "  ");
                }
                case 2:
                    System.out.print("\nIntersection of arrays is : ");
                    System.out.print("\n-------------------------------------");
                    for (int i = 0; i < n1; i++) {
                        for (int j = 0; j < n2; j++) {
                            if(arr1[i]== arr2[j]){
                                System.out.print(arr1[i]+"  ");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--------------------------------");
                    System.out.println("\nUnion of the arrays : ");
                    int[] arr3 =new int[n1+n2];
                    for (int i = 0; i < n1; i++) {
                         arr3[i] = arr1[i];

                    }
//                    for (int i = 0; i < n1; i++) {
//                        System.out.print(arr3[i]+"  ");
                    //}
                    for (int i = 0; i < n1; i++) {
                        for (int j = 0; j < n2; j++) {
                            if( arr3[i] != arr2[j]){
                                arr3[n1+i] = arr2[j]; i++;
                            }
                        }
                    }
                    for (int i = 0; i < arr3.length; i++) {
                        System.out.print(arr3[i]+"  ");
                    }
                case 4:
                    System.out.println("----------------------------------");
                    System.out.println("Difference in arrays : ");
                    for (int i = 0; i < n1; i++) {
                        for (int j = 0; j < n2; j++) {
                            if(arr1[i] == arr2[j]){

                            }
                        }
                    }
            }
        }while(ch !=0);

    }
}
