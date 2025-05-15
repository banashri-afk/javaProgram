public class AmstrogNumber {
    public static void main(String[] args) {
        int number = 153;  // You can change this number to test others
        int original = number;
        int sum = 0;

        // Count the number of digits
        int digits = String.valueOf(number).length();
        System.out.println(digits);
        // Calculate sum of each digit raised to the power of total digits
        while (number > 0) {
            int digit = number % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;

            }
            sum *= power;
            number /= 10;
            // Check if the original number equals the calculated sum
            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        }
    }
}