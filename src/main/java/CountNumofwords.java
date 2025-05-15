import java.util.HashMap;
import java.util.Map;

public class CountNumofwords {
    public static void main(String[]args){
        String input="My my name is banashri borah borah";
       /* int wordcount=input.trim().split("\\s+").length;
        System.out.println(wordcount);*/
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = input.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();  // Convert to lowercase to make it case-insensitive
           if(wordCount.containsKey(word)){
               wordCount.put(word,wordCount.get(word)+1);
           }
           else{
               wordCount.put(word,1);
           }
        }

        // Step 4: Print the word counts
        System.out.println(wordCount);
        }
    }


