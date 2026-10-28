// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:14 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;

        }

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);

        }
    }
}

