package Fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int num = 5;
        generateFibonacci(num);
    }

    public static void generateFibonacci(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

