// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
// Problem     Java Singleton Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-28, 02:18 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {

    public String str;

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

