package au.com.mir.java.datastructures.linkedlist.doublyLinkedList;

public class Node {
    Integer value;
    Node next;
    Node previous;

    public Node(Integer value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
