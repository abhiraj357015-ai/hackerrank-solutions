// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-27, 10:37 a.m.
// ──────────────────────────────────────────────────


import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);  
    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        
        scanner.close();
    }       
}

        
