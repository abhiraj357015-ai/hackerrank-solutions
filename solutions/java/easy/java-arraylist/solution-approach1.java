// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Problem     Java Arraylist
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 03:07 p.m.
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

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {

                row.add(sc.nextInt());

            }

            list.add(row);

        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();

            int y = sc.nextInt();

            if (x >= 1 && x <= n && y >= 1 && y <= list.get(x - 1).size()) {

                System.out.println(list.get(x - 1).get(y - 1));

            } else {

                System.out.println("ERROR!");

            }

        }

        sc.close();
    }
}
