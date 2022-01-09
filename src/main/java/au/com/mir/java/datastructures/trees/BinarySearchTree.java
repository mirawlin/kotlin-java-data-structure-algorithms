package au.com.mir.java.datastructures.trees;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node insert(Integer value) {
        var newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            var currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    // Left
                    if (currentNode.left != null) {
                        currentNode = currentNode.left;
                    } else {
                        currentNode.left = newNode;
                        break;
                    }
                } else {
                    // Right
                    if (currentNode.right != null) {
                        currentNode = currentNode.right;
                    } else {
                        currentNode.right = newNode;
                        break;
                    }
                }
            }
        }
        return root;
    }

    public Node lookup(Integer value) {
        if(root == null) {
            return null;
        }

        var currentNode = root;
        if (currentNode.value.equals(value)) {
            return currentNode;
        } else {
            while (currentNode != null) {
                if (value < currentNode.value) {
                        currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                        currentNode = currentNode.right;
                } else {
                    return currentNode;
                }
            }
        }
        return currentNode;
    }

    private void remove(Integer value) {
        if(root == null) {
            return;
        }

        var currentNode = root;
        Node parentNode = null;

        while(currentNode != null) {
            if(value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            } else {
                // found match to be removed --> if (currentNode.value.equals(value))
                // option 1: no right child
                if (currentNode.right == null) {
                    if(parentNode == null) {
                        this.root = currentNode.left;
                    } else {
                        // if current < parent --> current left child = left child of parent
                        if(currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.left;
                        } else if (currentNode.value > parentNode.value) {
                            // if current > parent --> current left child = right child of parent
                            parentNode.right = currentNode.left;
                        }
                    }
                }
                // option 2: right child doesnt have a left child
                else if (currentNode.right.left == null) {
                    if(parentNode == null) {
                        root = currentNode.left;
                    } else {
                        currentNode.right.left = currentNode.left;

                        // if current < parent --> make right child of the left node the parent
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.right;
                        }
                        // if current > parent --> make right child the right child of parent
                        else if (currentNode.value > parentNode.value) {
                            parentNode.right = currentNode.right;
                        }
                    }
                }
                // option 3: right child has a left child
                else {
                    // find right child's left most child
                    var leftmost = currentNode.right.left;
                    var leftmostParent = currentNode.right;
                    while(leftmost.left != null) {
                        leftmostParent = leftmost;
                        leftmost = leftmost.left;
                    }

                    // Parent's left subtree is now leftmost's right subtree
                    leftmostParent.left = leftmost.right;
                    leftmost.left = currentNode.left;
                    leftmost.right = currentNode.right;

                    if(parentNode == null) {
                        root = leftmost;
                    } else {
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = leftmost;
                        } else if (currentNode.value > parentNode.value) {
                            parentNode.right = leftmost;
                        }
                    }
                }
                return;
            }
        }
    }

    public static void main(String[] args) {
        var tree = new BinarySearchTree();

        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(140);
        tree.insert(15);
        tree.insert(1);

        System.out.println(tree.lookup(200));
        System.out.println(tree);
        tree.remove(20);
        System.out.println(tree);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "\"root\":" + root +
                '}';
    }
}
