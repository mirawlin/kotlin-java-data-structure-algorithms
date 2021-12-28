package au.com.mir.java;

import java.util.Arrays;

public class MyArray {
    private Integer length = 0;
    private String[] data = new String[10];

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public Integer getLength() {
        return this.length;
    }

    public String get(Integer index) {
        return this.data[index];
    }

    public Integer push(String item) {
        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    //O(n)
    public void pop() {
        var indexToRemove = this.length-1;

        // create temp array with size one less than original (10 - 1)
        var tempArray = new String[this.data.length - 1];

        // copy all the elements in the original to proxy array except the one at index
        for(int i = 0, k = 0; i < this.data.length; i++) {
            // check if index is crossed, continue without copying
            if (i == indexToRemove)
                continue;
            // else copy the element
            tempArray[k++] = this.data[i];
        }
        this.length--;
        this.data = tempArray;
    }

    //O(n)
    public void delete(Integer index) {
        // could probably use the same logic as pop() above but with index specified
        shiftItems(index);
        this.pop();
    }

    private void shiftItems(Integer index) {
        // shift items to the left by 1
        // starting from the index specified, replace current index with what is to its right
        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i+1];
        }
//        this.data[this.length-1]
    }
}
