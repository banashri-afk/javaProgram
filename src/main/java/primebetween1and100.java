public class primebetween1and100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to √num
            for (int i = 2; i*i<=num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print prime numbers
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
