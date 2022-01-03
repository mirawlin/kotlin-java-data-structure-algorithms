package au.com.mir.java.datastructures.arrays;

public class MergeSortedArray {

    public Integer[] mergeSortedArray(Integer[] array, Integer[] array2) {
        var sizeOfArray = array.length + array2.length;
        var mergedArray = new Integer[sizeOfArray];

        var arrIndex = 0;
        var arr2Index = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            var array1HasMoreValues = arrIndex < array.length;
            var reachedEndOfArray2 = arr2Index == array2.length;

            if (array1HasMoreValues && (reachedEndOfArray2 || array[arrIndex] < array2[arr2Index])) {
                mergedArray[i] = array[arrIndex];
                arrIndex++;
            } else {
                mergedArray[i] = array2[arr2Index];
                arr2Index++;
            }
        }
        return mergedArray;
    }
}
