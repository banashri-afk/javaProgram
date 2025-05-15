package org.example;

public class SpecialCharCount {
    public  static void main(String[]args){

    String input = "Hello123@# World!";

    int letters = 0, digits = 0, special = 0;

       for (int i=0;i<input.length();i++){
          char ch=input.charAt(i) ;
           if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
               letters++;
       }
            else  if((ch >= '0' && ch <= '9')){
                 digits++;
             }
             else if (ch!=' '){
                 special++;

             }
           }
        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
}
}

