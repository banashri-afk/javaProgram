package org.example;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "hello world from java";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        String capitalized = result.toString().trim();
        System.out.println("Capitalized: " + capitalized);
    }
}
