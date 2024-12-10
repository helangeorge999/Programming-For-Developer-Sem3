// Recursive approach to find factorial
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {   // Base case
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
