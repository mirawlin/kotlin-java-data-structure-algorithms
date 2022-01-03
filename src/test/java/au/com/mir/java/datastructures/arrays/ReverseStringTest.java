package au.com.mir.java.datastructures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverse() {
        //GIVEN
        ReverseString reverseString = new ReverseString();

        // WHEN
        var result = reverseString.reverse("hello");
        System.out.println(result);

        // THEN
        assertEquals("olleh", result);
    }
}
