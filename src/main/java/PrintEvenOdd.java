public class PrintEvenOdd {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        // Print elements at even indices
        System.out.print("Elements at even indices: ");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(); // New line for separation

        // Print elements at odd indices
        System.out.print("Elements at odd indices: ");
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}