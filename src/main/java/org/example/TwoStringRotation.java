package org.example;

public class TwoStringRotation {
    public static  void main(String[] args){
        String s1="waterbottle";
        String s2 = "erbottlewat";
        if (s1.length() != s2.length() || s1.length() == 0) {
            System.out.println(false);
        } else {
            String combined = s2 + s2;
            boolean isRotation = combined.contains(s1);
            System.out.println(isRotation);  // Output: true
        }
    }
}


