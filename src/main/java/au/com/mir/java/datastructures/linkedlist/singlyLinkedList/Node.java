package au.com.mir.java.datastructures.linkedlist.singlyLinkedList;

public class Node {
    Integer value;
    Node next;

    public Node(Integer value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
