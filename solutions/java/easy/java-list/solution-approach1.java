// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Problem     Java List
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 03:12 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            L.add(sc.nextInt());

        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            String operation = sc.next();

            if (operation.equals("Insert")) {

                int index = sc.nextInt();

                int value = sc.nextInt();

                L.add(index, value);

            } else if (operation.equals("Delete")) {

                int index = sc.nextInt();

                L.remove(index);

            }

        }

        for (int i = 0; i < L.size(); i++) {

            System.out.print(L.get(i));

            if (i < L.size() - 1) {

                System.out.print(" ");

            }

        }

        System.out.println();

        sc.close();
    }
}
