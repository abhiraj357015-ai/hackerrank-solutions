// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-27, 10:20 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        scan.close();
    }
}
