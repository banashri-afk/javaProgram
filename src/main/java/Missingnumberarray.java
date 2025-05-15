import java.util.HashSet;
import java.util.Set;

public class Missingnumberarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};  // Missing number is 5
        int n = 8;

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing Number: " + i);
                break;
            }
        }
    }
}