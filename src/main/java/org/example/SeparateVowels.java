package org.example;

public class SeparateVowels {
    public  static void main (String[] args){
        String word="banashrikdkoon";
        StringBuilder vowels = new StringBuilder();
        StringBuilder nonVowels = new StringBuilder();

        for (char c : word.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.append(c);
            } else {
                nonVowels.append(c);
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Non-vowels: " + nonVowels);
    }
}
