// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
// Problem     Java Varargs - Simple Addition
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 02:05 p.m.
// ──────────────────────────────────────────────────



class Add {

    public void add(int... numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            System.out.print(numbers[i]);

            if (i != numbers.length - 1) {
                System.out.print("+");
            }
        }

        System.out.println("=" + sum);
    }
}
