package au.com.mir.java.algorithms;

public class Factorial {

    public Integer findFactorialRecursive(Integer number){
        if (number == 2) {
            return 2;
        }
        return number * findFactorialRecursive(number - 1);
    }

    public Integer findFactorialIterative(Integer number){
        var answer = 1;

        if(number == 2) {
            answer = 2;
        }

        for(int i = 2; i <= number; i++) {
            answer = answer * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        var factorial = new Factorial();

        System.out.println(factorial.findFactorialIterative(5));
        System.out.println(factorial.findFactorialRecursive(5));
    }
}
