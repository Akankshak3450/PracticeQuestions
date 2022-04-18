package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GeekAndNewJob {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int flag = 0, flag1 = 0, flag2 = 0;
//        int count = 0;
//        while (t > 0) {
//            String str = sc.next();
//            int g = str.length();
//            // HashMap< Integer,Character> hm = new HashMap<>();
//            int i = 0;
//            while (i < g) {
//                char c = str.charAt(i);
//                if (Character.isDigit(c)) {
//                    flag = 1;
//
//                }else if (Character.isUpperCase(c)) {
//                    flag1 = 1;
//
//                }else if (Character.isLowerCase(c)) {
//                    flag2 = 1;
//
//                }
//                i++;
//
//            }
//            if (flag == 1 || flag1 == 1 || flag2 == 1) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//                t--;
//
//            }
//        }

        String str = sc.next();
        int count=0;
        char[] temp = new char[str.length()];
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            temp[index] = str.charAt(i);
            index++;
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+"   ");
        }
        int num=0;
        for (int i = 0; i < temp.length-1; i++) {
            if(temp[i] >=48 && temp[i]<=57){
                num++;

            }
        }
        System.out.println(num);
        int u=0;
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i]>=65 && temp[i]<=90){
                u++;

            }
        }
        System.out.println(u);
        int l=0;

        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>=97 && temp[i]<=122){
                l++;

            }
        }
        System.out.println(l);
        if(l>0 && u>0 && num>0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
