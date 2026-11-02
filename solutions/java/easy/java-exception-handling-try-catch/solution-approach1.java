// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
// Problem     Java Exception Handling (Try-catch)
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-11-02, 02:52 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {

            int a = in.nextInt();

            int b = in.nextInt();

            System.out.println(a / b);

        } catch (InputMismatchException e) {

            System.out.println(e.getClass().getName());

        } catch (ArithmeticException e) {

            System.out.println(e);

        }

        in.close();
    }
}
