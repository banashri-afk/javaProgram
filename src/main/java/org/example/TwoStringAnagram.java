package org.example;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] arg) {

        String s1 = "listen", s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("not angram");

        } else {
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
  if (Arrays.equals(a,b)){
      System.out.println("anagrams ");
  }
     else {
      System.out.println("not anagrams ");}
        }
    }
}
