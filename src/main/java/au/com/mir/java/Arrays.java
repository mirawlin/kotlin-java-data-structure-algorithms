package au.com.mir.java;

import java.time.Duration;
import java.time.Instant;

public class Arrays {

    private String[] nemo = {"nemo"};
    private Integer[] numbers = {1,2,3,4,5};

    public void findNemo(String[] array) {
        var start = Instant.now();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("nemo"))
                System.out.println("Found Nemo!");
        }

        var finish = Instant.now();
        var timeElapsed = Duration.between(start, finish).toMillis();

        var timeTaken = String.format("Time taken is: %s miliseconds", timeElapsed);

        System.out.println(timeTaken);
    }

    public void pairs(Integer[] num) {
         for (int i = 0; i < num.length; i++) {
             for (int k = 0; k < num.length; k++) {
                 String pair = String.format("%s, %s", num[i], num[k]);
                 System.out.println(pair);
             }
         }
    }
}
