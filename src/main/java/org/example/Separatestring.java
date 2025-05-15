package org.example;

public class Separatestring {

    public static void main(String[] args) {
        String sentence = "  Java is   a powerful   language  ";

        // Split by one or more spaces using regex "\\s+"
        String[] words = sentence.trim().split("\\s+");

        if (words.length >= 2) {
            System.out.println(words[0] + " " + words[1]);
        } else {
            System.out.println("Not enough words in the sentence.");
        }
        }
    }
