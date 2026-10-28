// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 10:57 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String firstA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String firstB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(firstA + " " + firstB);

        sc.close();   
    }
}



