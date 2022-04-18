package com.company;

public class StartEndCount {
    public void SECount(int[] arr, int m, int n){

        int j=0;
        int temp=0;
        int count=0;
        for(int i=0;i<m-1;i++) {
            if (arr[i] == n) {
                System.out.println(i);
                break;
            }
        }
            for(int i=0;i<m-1;i++) {
            if(arr[i]==n && arr[i+1]!=n){
                System.out.println(i);
                break;
            }
        }
    }
}
