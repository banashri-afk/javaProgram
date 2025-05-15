package org.example;

public class SeparateApphateNumber {
    public static  void main(String[] args){
        String input = "abc123xyz789";

        String letters = "";
        String digits = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if alphabet
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letters += ch;
            }
            // Check if digit
            else if (ch >= '0' && ch <= '9') {
                digits += ch;
            }
        }

        System.out.println("Alphabets: " + letters);  // Output: abcxyz
        System.out.println("Numbers: " + digits);     // Output: 123789
    }
}


