package au.com.mir.java.datastructures.arrays;

import org.junit.jupiter.api.Test;

class ArraysTest {

    @Test
    void findNemo() {
        String[] nemo = { "nemo" };
        String[] everyone = { "dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank" };

        Arrays result = new Arrays();
        result.findNemo(everyone);
    }

    @Test
    void pairs() {
        Integer [] numbers = {1,2,3,4,5};

        Arrays result = new Arrays();
        result.pairs(numbers);
    }
}
