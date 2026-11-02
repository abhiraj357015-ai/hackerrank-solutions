// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true
// Problem     Java Exception Handling
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-11-02, 02:54 p.m.
// ──────────────────────────────────────────────────


class MyCalculator {
     long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {

            throw new Exception("n or p should not be negative.");

        }

        if (n == 0 && p == 0) {

            throw new Exception("n and p should not be zero.");

        }

        return (long) Math.pow(n, p);

    }

}
    


