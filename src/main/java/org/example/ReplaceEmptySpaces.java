package org.example;

public class ReplaceEmptySpaces {
    public static void main(String[] args) {
        String input = "Java is awesome";
        String output = "";
        for (char c : input.toCharArray()) {
            if (c == ' ')
                output += '-';
            else
                output += c;
        }
        System.out.println(output);  // Output: Java-is-awesome
    }
}
