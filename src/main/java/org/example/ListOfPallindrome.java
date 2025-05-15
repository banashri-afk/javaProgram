package org.example;

public class ListOfPallindrome {
    public static void main(String[] args) {

        String[] words = {"scholl", "masam", "nigoni"};

        for (String word : words) {
            boolean isPalindrome = true;

            int left = 0, right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
          String result=isPalindrome?"pallindrome":"not pallindrome";
            System.out.println(word+" =" +result);
           }
    }
}
