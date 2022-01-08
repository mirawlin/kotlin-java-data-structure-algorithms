package au.com.mir.java.datastructures.stacks;

public class StackLinkedList {
    private Node top;
    private Node bottom;
    private Integer length;

    public StackLinkedList() {
        top = null;
        bottom = null;
        length = 0;
    }

    // looks at top
    public Integer peek() {
        return top.value;
    }

    // add to top
    public void push(Integer value) {
        var newNode = new Node(value);
        if (top == null) {
            top = newNode;
            bottom = newNode;
        } else {
            var previousTop = top;
            top = newNode;
            top.next = previousTop;
        }
        length++;
    }

    // remove from top
    public void pop() {
        if(top == bottom) {
            bottom = null;
        }
        top = top.next;
        length--;
    }

    public static void main(String[] args) {
        var stack = new StackLinkedList();
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
        return "Stack{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }
}
