package au.com.mir.java;

public class MergeSortedArray {

    public Integer[] mergeSortedArray(Integer[] array, Integer[] array2) {
        var sizeOfArray = array.length + array2.length;
        var mergedArray = new Integer[sizeOfArray];

        var arrIndex = 0;
        var arr2Index = 0;

        var array2HasMoreValues = arr2Index != array2.length;
        var reachedEndOfArray1 = arrIndex == array.length;

        for (int i = 0; i < sizeOfArray; i++) {
                if (array2HasMoreValues && (reachedEndOfArray1 || array2[arr2Index] < array[arrIndex])) {
                    mergedArray[i] = array2[arr2Index];
                    arr2Index++;

                } else {
                    mergedArray[i] = array[arrIndex];
                    arrIndex++;
                }
        }
        return mergedArray;
    }
}
