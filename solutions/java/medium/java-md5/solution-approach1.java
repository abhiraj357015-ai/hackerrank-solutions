// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true
// Problem     Java MD5
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-11-02, 02:50 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(s.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();

        for (byte b : hash) {

            sb.append(String.format("%02x", b & 0xff));

        }

        System.out.println(sb.toString());
        
    }
}
