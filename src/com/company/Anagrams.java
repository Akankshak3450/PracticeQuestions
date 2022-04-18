package com.company;
import java.util.*;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1= s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(s1.length() != s2.length()){
            System.out.println("Not anagrams");
        }else if(s1.length()== s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                if(c1[i] == c2[i]){
                    System.out.println("Anagrams ");
                    break;
                }
            }
        }
    }
}
