package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String [] args){
        String s="abcabcabcccab";
        int maxlength=0;
        int left=0;
        Set<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
         set.add(s.charAt(i));
            maxlength=Math.max(maxlength,i-left+1);
        }
        System.out.println(maxlength);
    }
}
