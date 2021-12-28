package au.com.mir.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        //GIVEN
        var reverseString = new ReverseString();

        // WHEN
        var result = reverseString.reverse("hello");
        System.out.println(Arrays.toString(result));

        // THEN
        assertEquals("o", result[0]);
        assertEquals("l", result[1]);
        assertEquals("l", result[2]);
        assertEquals("e", result[3]);
        assertEquals("h", result[4]);
    }
}
