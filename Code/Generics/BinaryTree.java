import java.util.LinkedList;

/**
 * A binary tree implementation.
 */
public class BinaryTree <K> {
    private final Node <T> root;
    private final LinkedList<Integer> path;

    public BinaryTree(int[] values) {
        this.root = buildTree(values, 0, values.length - 1);
        this.path = new LinkedList<>();
    }

    public LinkedList<Integer> getPath() {
        return this.path;
    }

    public Node <T> getRoot() {
        return this.root;
    }

    // Build a binary tree by adding the middle element to the tree,
    // then recursively doing the same to the left and right halves
    // of the array.
    private Node <T> buildTree(int[] values, int low, int high) {
        /*
         * 1. Grab the middle element.
         * 2. Create a root Node with that element as the value.
         * 3. Do the same on the left half, and make the result the left child
         *    of the root.
         * 4. Do the same on the right half, and make the result the right child
         *    of the root.
         * 5. Return the root from step 1.
         */
        if (values.length == 0) {
            return null;
        }

        if (high < low) {
            return null;
        }

        int mid = (high + low)  / 2;
        Node<K> left = buildTree(values, low, mid - 1);
        Node<K> right = buildTree(values, mid + 1, high);

        return new Node<K>(values[mid], left, right);
    }

    /**
     * Print the node values in order of
     * pre-order traversal.
     * @param node The root of the current subtree
     */
    public void preOrder(Node <T> node, int level) {
        if (node == null) {
            System.out.println(" ".repeat(level) + "X");
            return;
        }

        System.out.println(" ".repeat(level) + node.value);
        preOrder(node.left, level + 2);
        preOrder(node.right, level + 2);
    }

    /**
     * Search for the specified value in the tree, and
     * if found return a path from the root to the value.
     * @param searchVal The value to search for
     * @return true if searchVal was found, false otherwise
     */
    public boolean find(int searchVal) {
        this.path.clear();
        return find(searchVal, this.root);
    }

    // Search the binary tree for the value.
    private boolean find(int searchVal, Node <T> node) {
        if (node == null) {
            return false;
        }

        if (node.value == searchVal) {
            this.path.addFirst(node.value);
            return true;
        }

        boolean found = find(searchVal, node.left) ||
                find(searchVal, node.right);

        if (found) {
            this.path.addFirst(node.value);
        }

        return found;
    }

    // Inner class.  Private data can be accessed by outer class
    // Data is public here so that it can be accessed by TestCases
    public static class Node <T> {
        public final int value;
        public Node <T> left, right;

        public Node(int value, Node <T> left, Node <T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public String toString() {
            return this.value.toString();
        }
    }
}
