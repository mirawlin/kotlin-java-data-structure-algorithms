package au.com.mir.java.algorithms.dynamicProgramming;

import java.util.HashMap;

public class DynamicFibonacci {
    private HashMap<Integer, Integer> cache = new HashMap<>();
    static Integer operationsCount = 0;

    public Integer dynamicFibonacci(Integer number) {

        if (cache.containsKey(number)) {
            return cache.get(number);
        } else {
            if (number < 2) {
                return number;
            } else {
                operationsCount++;
                cache.put(number, dynamicFibonacci(number - 1) + dynamicFibonacci(number - 2));
                return cache.get(number);
            }
        }
    }

    public static void main(String[] args) {
        var fib = new DynamicFibonacci();
        System.out.println(fib.dynamicFibonacci(10));
        System.out.println(operationsCount);
    }
}
