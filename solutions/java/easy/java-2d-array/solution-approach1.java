// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
// Problem     Java 2D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 02:55 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int maxSum = Integer.MIN_VALUE;

for (int i = 0; i < 4; i++) {

    for (int j = 0; j < 4; j++) {

        int sum = arr.get(i).get(j)

                + arr.get(i).get(j + 1)

                + arr.get(i).get(j + 2)

                + arr.get(i + 1).get(j + 1)

                + arr.get(i + 2).get(j)

                + arr.get(i + 2).get(j + 1)

                + arr.get(i + 2).get(j + 2);

        maxSum = Math.max(maxSum, sum);

    }

}

System.out.println(maxSum);
    }
}
