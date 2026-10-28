// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
// Problem     Java Substring Comparisons
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 11:03 p.m.
// ──────────────────────────────────────────────────



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }

