package com.company;

import java.util.Scanner;

public class RCBAndPlayOffs {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int X = sc.nextInt();
//        int Y = sc.nextInt();
//        int Z = sc.nextInt();
//        int d= X+Z*2;
//        if(Y<=d) System.out.println("YES");
//        else System.out.println("NO");

        Scanner sc= new Scanner(System.in);
        Scanner s= new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String st = s.nextLine();
        System.out.println(i+4);
        System.out.println(d+4.0);

        System.out.println("HackerRank"+" "+st);
    }
}
/*
Team RCB has earned X points in the games it has played so far in this year's IPL. To qualify for the playoffs they must earn at least a total of Y points. They currently have Z games left, in each game they earn 2 points for a win, 1 point for a draw, and no points for a loss.

Is it possible for RCB to qualify for the playoffs this year?
 */