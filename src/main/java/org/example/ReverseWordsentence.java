package org.example;

public class ReverseWordsentence {
    public static  void main (String [] args){
        String input = "the sky is blue";
        String[] words = input.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            result+=" ";

        }
        System.out.println(result);
    }
}
