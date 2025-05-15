package org.example;

public class Subsequent {
    public static void main(String[] args) {
        String A = "abc";
        String B = "aebdc";

        int aIndex = 0, bIndex = 0;

        // Traverse both strings
        while (aIndex < A.length() && bIndex < B.length()) {
            if (A.charAt(aIndex) == B.charAt(bIndex)) {
                aIndex++;  // Move to the next character in A
            }
            bIndex++;  // Always move to the next character in B
        }

        // If we've gone through all of A, it means A is a subsequence of B
        if (aIndex == A.length()) {
            System.out.println(A + " is a subsequence of " + B);
        } else {
            System.out.println(A + " is not a subsequence of " + B);
        }
    }
}