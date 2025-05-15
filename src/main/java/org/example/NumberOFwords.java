package org.example;

public class NumberOFwords {
    public static void main(String[] args) {
        String sentence = "  Java is   a powerful   language  ";
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (!Character.isWhitespace(c)) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Number of words: " + wordCount);
    }
}
