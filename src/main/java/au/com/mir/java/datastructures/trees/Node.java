package au.com.mir.java.datastructures.trees;

public class Node {
    Node left;
    Node right;
    Integer value;

    public Node(Integer value) {
        left = null;
        right = null;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "\"left\":" + left +
                ", \"right\":" + right +
                ", \"value\":" + value +
                '}';
    }
}
