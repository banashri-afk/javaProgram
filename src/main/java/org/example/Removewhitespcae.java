package org.example;

public class Removewhitespcae {

  /*  public static void main(String[] args) {
        String input = "  Java   is  fun  ";

        // Remove all whitespace characters (spaces, tabs, newlines, etc.)
        String noSpaces = input.replaceAll("\\s+", "");

        System.out.println("Original: [" + input + "]");
        System.out.println("Without spaces: [" + noSpaces + "]");
    }
}*/

    public static void main(String[] args) {
        String input = "  Java   is  fun  ";
        StringBuilder noSpaces = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                noSpaces.append(c);
            }
        }

        System.out.println("Original: [" + input + "]");
        System.out.println("Without spaces: [" + noSpaces + "]");
    }
}