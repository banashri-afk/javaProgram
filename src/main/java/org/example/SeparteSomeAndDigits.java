package org.example;

public class SeparteSomeAndDigits {

    public  static  void main (String [] args){
        String input="abcdg123456";
        int sum=0;
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if (Character.isDigit(ch)){
                sum+=ch-'0';


            }
        }
        System.out.println(sum);
    }
}
