public class Fcatorial {


    public static void main(String[] args) {
       int number = 5;
       /* int factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);*/


        int result = factorial(number);
        System.out.println("Factorial of " + number + " (recursion): " + result + " I am new");
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }
}