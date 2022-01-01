package au.com.mir.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void get_shouldRetrieveTheItemAtGivenIndex() {
        // GIVEN
        var newArray = new MyArray();
        newArray.push("hello");
        newArray.push("hi");

        // WHEN
        var result = newArray.get(1);

        // THEN
        assertEquals("hi", result);
    }

    @Test
    public void push_shouldAddItemsToArray() {
        // GIVEN
        var newArray = new MyArray();

        // WHEN
        newArray.push("hello");
        newArray.push("hi");
        System.out.println(newArray);

        // THEN
        assertEquals("hello", newArray.get(0));
        assertEquals("hi", newArray.get(1));
    }

    @Test
    public void pop_shouldDeleteLastItemInArray() {
        // GIVEN
        var newArray = new MyArray();

        // WHEN
        newArray.push("hello");
        newArray.push("hi");
        newArray.pop();
        System.out.println(newArray);

        // THEN
        assertEquals("hello", newArray.get(0));
        assertEquals(1, newArray.getLength());
    }

    @Test
    public void delete_shouldDeleteSpecifiedItemInArray() {
        // GIVEN
        var newArray = new MyArray();

        // WHEN
        newArray.push("hello");
        newArray.push("hi");
        newArray.push("!");
        newArray.delete(1);

        System.out.println(newArray);

        // THEN
        assertEquals("hello", newArray.get(0));
        assertEquals("!", newArray.get(1));
        assertEquals(2, newArray.getLength());
    }
}
