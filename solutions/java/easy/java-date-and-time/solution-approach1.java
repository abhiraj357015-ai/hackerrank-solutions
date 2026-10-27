// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
// Problem     Java Date and Time
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 02:11 a.m.
// ──────────────────────────────────────────────────



class Result {
    
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        return dateFormat.format(calendar.getTime()).toUpperCase();
    }
}
