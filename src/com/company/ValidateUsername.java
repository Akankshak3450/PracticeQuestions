package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            validOrNot(str);
        }
    }
    public static void validOrNot(String str){
        int n = str.length();
        int flag=0;
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        int digit =0;
        String ss="";
        int letters =0;
        int uns =0;
        for (int i = 0; i < n; i++) {
            if (n >= 8 && n <= 30) {
                if (arr[0]>='a'&& arr[0]<='z' || arr[0]>='A'&& arr[0]<='Z') {
                    if((arr[i] >= '0' && arr[i] <= '9') || (arr[i] >='a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z') || arr[i] == '_') {
                        if(arr[i]!='@')
                        {
                            flag=1;
                        }

                        //  ss= "Valid";
                    }
                }
            }
        }
        if(flag==1){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
