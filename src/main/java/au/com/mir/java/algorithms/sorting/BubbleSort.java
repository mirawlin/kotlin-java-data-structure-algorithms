package au.com.mir.java.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size()-1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99,44,6,2,1,5,63,87,283,4,0));
        var bubble = new BubbleSort();

        System.out.println(bubble.bubbleSort(numbers));
    }
}
