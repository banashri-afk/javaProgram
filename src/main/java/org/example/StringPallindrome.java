package org.example;

public class StringPallindrome {
    public static void main(String[] args) {

        String input = "madam";
        String revser="";
        for (int i=input.length()-1;i>=0;i--){
            revser+=input.charAt(i);
        }
        if (revser.equals(input)){
            System.out.println("pallindrome");
        }
        }
    }
