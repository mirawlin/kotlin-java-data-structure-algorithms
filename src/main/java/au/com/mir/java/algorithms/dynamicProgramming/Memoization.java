package au.com.mir.java.algorithms.dynamicProgramming;

import java.util.HashMap;

public class Memoization {

    HashMap<Integer, Integer> cache = new HashMap();

    public Integer addTo80(Integer number) {
        return number + 80;
    }


    public Integer memoizedAddTo80(Integer number) {
        if (!cache.containsKey(number)) {
            System.out.println("hello");
            cache.put(number, number + 80);
        }
        return cache.get(number);
    }


    public static void main(String[] args) {
        var addNumbers = new Memoization();
        System.out.println(addNumbers.memoizedAddTo80(5));
        System.out.println(addNumbers.memoizedAddTo80(5));
    }
}
