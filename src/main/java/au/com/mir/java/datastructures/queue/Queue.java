package au.com.mir.java.datastructures.queue;

public class Queue {
    private Node first;
    private Node last;
    private Integer length;

    public Queue() {
        first = null;
        last = null;
        length = 0;
    }

    public String peek() {
        return first.value;
    }

    public void enqueue(String value) {
        var newNode = new Node(value);

        if(length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void dequeue() {
        if (first == last) {
            last = null;
        }
        first = first.next;
        length--;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        var queue = new Queue();
        queue.enqueue("hello");
        queue.enqueue("google");
        queue.enqueue("amazon");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
