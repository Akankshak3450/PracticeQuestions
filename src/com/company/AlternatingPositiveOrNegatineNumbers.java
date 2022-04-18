package com.company;

import java.util.Scanner;

public class AlternatingPositiveOrNegatineNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        AlterPosNeg(arr,n);
    }
    public static void AlterPosNeg(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int count=0;
        int cnt =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                count++;
            }
        }
        cnt = n-count;
        int [] pos = new int[count];
        int [] neg = new int[cnt];
        int j=0,k=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                pos[j++] = arr[i];
            }else{
                neg[k++] = arr[i];
            }
        }
        System.out.print("\nPOS : ");
        for (int i = 0; i <count ; i++) {
            System.out.print(pos[i]+"  ");
        }
        System.out.print("\nNEG : ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(neg[i]+"  ");
        }
        int h =0,u=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                while (h < count) {
                    arr[i] = pos[h];
                    h++;
                }
            }else {
                while(u<cnt) {
                    arr[i] = neg[u];
                    u++;
                }
            }
        }
        System.out.print("\nArray is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int p=-1;
        int temp=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                p++;
                temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
            }
        }
        int po =p+1;
        int ne= 0;
        System.out.println("New Array : ");
        while(po<n && ne<po && arr[ne]<0 ){
            temp = arr[ne];
            arr[ne] = arr[po];
            arr[po] = temp;
            po++;
            ne +=2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
