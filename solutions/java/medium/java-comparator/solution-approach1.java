// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
// Problem     Java Comparator
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 03:44 p.m.
// ──────────────────────────────────────────────────



class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {

        if (a.score == b.score) {

            return a.name.compareTo(b.name);

        }

        return b.score - a.score;

    }

}

