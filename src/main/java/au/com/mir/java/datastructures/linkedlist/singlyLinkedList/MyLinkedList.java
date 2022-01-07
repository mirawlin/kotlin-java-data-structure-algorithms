package au.com.mir.java.datastructures.linkedlist.singlyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private Integer length;


    public MyLinkedList(Integer value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(Integer value) {
        var newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(Integer value) {
        var newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(Integer index, Integer value) {
        if (index >= length) {
            append(value);
        }
        var newNode = new Node(value);

        var leader = traverseToIndex(index - 1);
        var holdingPointer = leader.next;

        leader.next = newNode;
        newNode.next = holdingPointer;
        length++;
    }

    public Integer[] printLinkedList() {
        var array = new Integer[length];

        var currentNode = this.head;
        var index = 0;
        while (currentNode != null) {
            array[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }

        return array;
    }

    private Node traverseToIndex(Integer index) {
        var counter = 0;
        var currentNode = this.head;

        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public void remove(Integer index) {
        var leadNode = traverseToIndex(index - 1);
        var nodeToDelete = leadNode.next;
        leadNode.next = nodeToDelete.next;
        length--;
    }

    public void reverse() {
        var first = head;
        tail = head;
        var second = first.next;

        while(second != null) {
            var temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        head = first;
    }

    public static void main(String[] args) {
        var list = new MyLinkedList(10);
        list.append(5);
        list.append(16);
        list.append(10);
        list.prepend(1);
        list.insert(2, 3);
        list.remove(1);
        System.out.println(Arrays.toString(list.printLinkedList()));

        list.reverse();
        System.out.println(Arrays.toString(list.printLinkedList()));
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
