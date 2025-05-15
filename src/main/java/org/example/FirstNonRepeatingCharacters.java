package org.example;
import java.util.*;
public class FirstNonRepeatingCharacters {
    public static  void main (String[] args){
        String input="swiss";
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        Character result =null;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                result=entry.getKey();
                break;
            }
        }
        if (result!=null){
            System.out.println("first non repeating character " +result);
        }
        else {
            System.out.println("not found ");
        }
    }
}
