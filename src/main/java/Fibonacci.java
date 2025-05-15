public class Fibonacci {

   /* public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
        }
    }

    public static void main(String[] args) {
        int terms = 10;  // Number of Fibonacci terms to print

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}*/

    public static void main(String[] args) {

        int terms = 10;  // Number of terms to print

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");

            // Calculate the next number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
