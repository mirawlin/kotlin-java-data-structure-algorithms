package au.com.mir.java.algorithms.recursion;

public class Fibonacci {

    public Integer fibonacciIterative(Integer number) {
        var result = 0;
        var first = 0;
        var second = 1;

        if(number < 2) {
            return number;
        } else {
            for (int i = 2; i < number + 1; i++) {
                result = first + second;
                first = second;
                second = result;
            }
        }
        return result;
    }

    public Integer fibonacciRecursive(Integer number) { // O(2^n) --> exponential
        if (number < 2) {
            return number;
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    public static void main(String[] args) {
        var fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacciIterative(6));
        System.out.println(fibonacci.fibonacciRecursive(8));
    }
}
