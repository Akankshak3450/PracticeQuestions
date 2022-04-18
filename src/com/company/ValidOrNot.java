package com.company;
import java.util.*;
public class ValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
//        String s2 = sc.next();
//        String s3 = sc.next();
//        String s4 = sc.next();
        Stack<Character> s = new Stack<Character>();
        char ch =' ';
        int sw =0;

        while(sw != s1.length()){
            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                if (c1 == '(' || c1 =='{'|| c1 =='['){
                    s.push(c1);
                    System.out.println("Pushed data is : "+c1);
                }

                sw++;
            }
        }
        while(sw != ' ') {
            if (s.peek() == '(' || s.peek() == '{' || s.peek() == '[') {
                char cs = s.pop();
                System.out.println("Popped : " + cs);
            }
            sw--;
        }

        if(s.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
