package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String st = "banashri is my name";
        String reverse="";
        for (int i=st.length()-1;i>=0;i--){
            reverse+=st.charAt(i);

        }
        System.out.println(reverse);
    }
}