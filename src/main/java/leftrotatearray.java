import java.util.Arrays;

public class leftrotatearray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Perform left rotation by 1
        int first = numbers[0]; // store the first element
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1]; // shift elements left
        }
        numbers[numbers.length - 1] = first; // put first at the end
        System.out.println(Arrays.toString(numbers));
        }
    }
