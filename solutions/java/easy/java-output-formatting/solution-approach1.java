// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-27, 04:39 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.printf("%-15s%03d%n", s1, x);
                
            }
            
            System.out.println("================================");
            
            sc.close();

    }
}



