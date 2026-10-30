// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
// Problem     Java Map
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 03:15 p.m.
// ──────────────────────────────────────────────────

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String name = in.nextLine();

            int phone = in.nextInt();

            in.nextLine();

            phoneBook.put(name, phone);

        }

        while (in.hasNext()) {

            String s = in.nextLine();

            if (phoneBook.containsKey(s)) {

                System.out.println(s + "=" + phoneBook.get(s));

            } else {

                System.out.println("Not found");

            }

        }

        in.close();
		}
	}




