import java.util.HashSet;
import java.util.Set;

public class PrintDupliactes {
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}
