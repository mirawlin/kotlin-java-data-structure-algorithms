package au.com.mir.java.datastructures.stacks;

import java.util.ArrayList;

public class StackArray {
    private ArrayList<Integer> array;

    public StackArray() {
        array = new ArrayList<>();
    }

    // looks at top
    public Integer peek() {
        if (array.size() > 0)
            return array.get(array.size() - 1);
        else
            return null;
    }

    // add to top
    public void push(Integer value) {
        array.add(value);
    }

    // remove from top
    public void pop() {
        array.remove(array.size() - 1);
    }

    public static void main(String[] args) {
        var stack = new StackArray();
        stack.push(12);
        stack.push(99);
        stack.push(55);
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "array=" + array +
                '}';
    }
}
