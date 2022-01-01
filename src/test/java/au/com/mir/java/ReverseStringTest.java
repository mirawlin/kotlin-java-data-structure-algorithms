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
        System.out.println(result);

        // THEN
        assertEquals("olleh", result);
    }
}
