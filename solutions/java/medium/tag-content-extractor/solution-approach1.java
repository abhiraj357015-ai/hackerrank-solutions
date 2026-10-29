// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
// Problem     Tag Content Extractor
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 11:46 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group(2));
            found = true;
        }

        if (!found) {
            System.out.println("None");
        }
			
			testCases--;
		}
        
        in.close();
	}
}
