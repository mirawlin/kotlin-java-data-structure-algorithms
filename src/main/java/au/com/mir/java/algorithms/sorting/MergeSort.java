package au.com.mir.java.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> array){
        if(array.size() == 1) {
            return array;
        }
        var midpoint = array.size() / 2;

        var left = array.subList(0, midpoint);
        var right = array.subList(midpoint, array.size());

        return merge(mergeSort(left), mergeSort(right));
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        // compare the lists
        var result = new ArrayList<Integer>();
        var leftIndex = 0;
        var rightIndex = 0;

        while(leftIndex < left.size() && rightIndex < right.size()) {
            if(left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        List<Integer> leftRemaining = left.subList(leftIndex, left.size());
        List<Integer> rightRemaining = right.subList(rightIndex, right.size());

        result.addAll(leftRemaining);
        result.addAll(rightRemaining);

        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(99,44,6,2,1,5,63,87,283,4,0));

        var sort = new MergeSort();

        System.out.println(sort.mergeSort(numbers));
    }
}
