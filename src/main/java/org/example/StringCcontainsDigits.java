package org.example;

public class StringCcontainsDigits {

    public static void main(String[] args) {
        String input = "123456";
        boolean isDigit=true;
        for(char c:input.toCharArray()){
            if(c<'0'||c>'9'){
                isDigit=false;
                break;
            }
        }
        System.out.println("Only digits: " + isDigit);  // Output: true
    }
}
