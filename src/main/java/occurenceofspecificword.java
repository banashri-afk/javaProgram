import java.util.Arrays;
import java.util.List;

public class occurenceofspecificword {
    public static void main(String[] args) {


        String sentence = "Java is great, and Java is powerful. I love Java!";
        String targetWord = "java";
        String lowSentace = sentence.toLowerCase();
        String lowtarget = targetWord.toLowerCase();

        String[] words = lowSentace.split(" ");
        int count=1;
        for (String w:words){
            if(w.equals(lowtarget)){
                count++;

                List<String> items = Arrays.asList("apple", "banana", "cherry");
                String result = String.join(", ", items);
                System.out.println(result);
            }

        }
        System.out.println(count);
    }
}