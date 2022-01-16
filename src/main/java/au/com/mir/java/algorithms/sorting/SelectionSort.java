package au.com.mir.java.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
        var length = array.size();

        for (int i = 0; i < length; i++) {
            // set current index as minimum
            var min = i;
            var temp = array.get(i);
            // checks the next item in list
            for (int j = i + 1; j < length; j++) {
                if (array.get(j) < array.get(min)) {
                    // update minimum if current is lower than previous
                    min = j;
                }
            }
            array.set(i, array.get(min));
            array.set(min, temp);
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

        var sort = new SelectionSort();
        System.out.println(sort.selectionSort(numbers));
    }
}
