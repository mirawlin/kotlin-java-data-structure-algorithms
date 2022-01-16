package au.com.mir.java.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
        var arrayLength = array.size();

        for (int i = 0; i < arrayLength; i++) {
            // if number less than 1st number. then move it at start of array.
            if (array.get(i) < array.get(0)) {
                array.add(0, array.remove(i));
            } else {
                // else check where should the number be placed and move it.
                for (int j = 1; j < i; j++) {
                    //checks if current number is between j and j-1
                    if (array.get(i) > array.get(j - 1) && array.get(i) < array.get(j)) {
                        array.add(j, array.remove(i));
                        // end inner loop after element moved.
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

        var sort = new InsertionSort();
        System.out.println(sort.insertionSort(numbers));
    }
}
