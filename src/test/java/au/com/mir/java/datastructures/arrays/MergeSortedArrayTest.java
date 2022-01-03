package au.com.mir.java.datastructures.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void mergeSortedArray() {
        // GIVEN
        Integer[] array1 = { 0, 3, 4, 31 };
        Integer[] array2 = { 4, 6, 30 };

        Integer[] expected = { 0, 3, 4, 4, 6, 30, 31 };

        var mergeArray = new MergeSortedArray();

        // WHEN
        var result = mergeArray.mergeSortedArray(array1, array2);

        System.out.println(Arrays.toString(result));
        // THEN
        assertArrayEquals(expected, result);
    }
}
