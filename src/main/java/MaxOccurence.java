import java.util.HashMap;
import java.util.Map;

public class MaxOccurence {
    public static void main(String[] args) {
        String s = "success";
        Map<Character, Integer> freqMap = new HashMap<>();

        // Build the frequency map
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c,0)+ 1);
        }

        // Find the character with the highest frequency
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character with highest frequency: " + maxChar);
    }
}
