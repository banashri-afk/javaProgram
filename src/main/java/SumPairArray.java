public class SumPairArray {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15, 1, 8};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(numbers[i] + " + " + numbers[j] );
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No such pair found.");
        }

    }
}