package org.example;

public class ReverseOnlyOneWord {
    public static void main (String [] args){
        String word="my name is banashri";
        String targetWord="banashri";

        if (word.contains(targetWord)){
            String reversed=new StringBuilder(targetWord).reverse().toString();
            String output=word.replace(targetWord,reversed);
            System.out.println(output);

        }
        else{
            System.out.println("target word not found ");
        }
    }
}


