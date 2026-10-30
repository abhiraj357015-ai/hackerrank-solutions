// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-30, 03:31 p.m.
// ──────────────────────────────────────────────────

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            Stack<Character> stack = new Stack<>();

            boolean balanced = true;

            for (int i = 0; i < input.length(); i++) {

                char ch = input.charAt(i);

                if (ch == '(' || ch == '{' || ch == '[') {

                    stack.push(ch);

                } 

                else if (ch == ')' || ch == '}' || ch == ']') {

                    if (stack.isEmpty()) {

                        balanced = false;

                        break;

                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||

                        (ch == '}' && top != '{') ||

                        (ch == ']' && top != '[')) {

                        balanced = false;

                        break;

                    }

                }

            }

            if (!stack.isEmpty()) {

                balanced = false;

            }

            System.out.println(balanced);
		}
        
        sc.close();
		
	}
}



