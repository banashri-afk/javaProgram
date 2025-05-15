package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliactes {
    public static  void main (String[]args){

String input = "programming";
Set<Character> seen = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
        seen.add(c);  // Set automatically skips duplicates
        }

// Build result string from set
StringBuilder result = new StringBuilder();
        for (char c : seen) {
        result.append(c);
        }

                System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result.toString());
        }
        }
