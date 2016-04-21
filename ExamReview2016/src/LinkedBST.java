import java.lang.Comparable;

public class LinkedBST<T extends Comparable<T>> {

    private BSTNode<T> root;

    public LinkedBST() {
        root = null;
    }

    public void insert(T value) {
        if (root == null)
            root = new BSTNode<T>(value, null);
        else
            root.insertValue(value);
    }

    public void remove(T value) {
        if (root != null)
            root.removeValue(value);
    }

    public boolean contains(T value) {
        if (root != null)
            return root.contains(value);
        else
            return false;
    }

    public int size() {
        if (root != null)
            return root.nodeCount();
        else
            return 0;
    }

    private class BSTNode<NT extends Comparable<NT>> {
        private NT value;
        private BSTNode<NT> parent, left, right;

        private BSTNode(NT value, BSTNode<NT> parent) {
            this.value = value;
            this.parent = parent;
            left = right = null;
        }

        private void insertValue(NT value) {
            if (this.value.equals(value)) {
                return; // Already inserted
            } else if (left != null && this.value.compareTo(value) < 0) {
                left.insertValue(value);
            } else if (this.value.compareTo(value) < 0) {
                left = new BSTNode<NT>(value, this);
            } else if (right != null && this.value.compareTo(value) > 0) {
                right.insertValue(value);
            } else if (this.value.compareTo(value) > 0) {
                right = new BSTNode<NT>(value, this);
            }
        }

        private void removeValue(NT value) {
            if (this.value.equals(value)) {
                this.removeNode();
            } else if (left != null && this.value.compareTo(value) < 0) {
                left.removeValue(value);
            } else if (right != null && this.value.compareTo(value) > 0) {
                right.removeValue(value);
            } else {
                // Value not in tree
            }
        }

        private boolean contains(NT value) {
            if (this.value.equals(value)) {
                return true;
            } else if (left != null && this.value.compareTo(value) < 0) {
                return left.contains(value);
            } else if (right != null && this.value.compareTo(value) > 0) {
                return right.contains(value);
            } else {
                return false;
            }
        }

        private int nodeCount() {
            int count = 1;

            if (left != null)
                count += left.nodeCount();

            if (right != null)
                count += right.nodeCount();

            return count;
        }

        private int longestPathLength() {
            int longestDesentantPath = 0;

            if (left != null && right != null)
                longestDesentantPath = Math.max(left.longestPathLength(), right.longestPathLength());
            else if (left != null)
                longestDesentantPath = left.longestPathLength();
            else if (right != null)
                longestDesentantPath = right.longestPathLength();

            return longestDesentantPath + 1;
        }

        private void removeNode() {
            // TODO - complete me
            // Hint - you have access to the parent, left node, right node, and the BST root.
        }
    }

    public static void main(String[] args) {
        LinkedBST<Integer> tree = new LinkedBST<Integer>();
        System.out.println("Inserting: 5, 2, 8, 1, 4, 6, 3, 7");
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(3);
        tree.insert(7);

        System.out.println("Removing 2");
        tree.remove(2);
        if (tree.contains(2)) {
            System.out.println("2 is still in the tree!!!");
        } else {
            System.out.println("2 was removed");
        }

        System.out.println("Checking for the following values: 1, 4, 3");
        if (!tree.contains(1)) {
            System.out.println("1 is missing!");
        }
        if (!tree.contains(4)) {
            System.out.println("4 is missing!");
        }
        if (!tree.contains(3)) {
            System.out.println("3 is missing!");
        }

        System.out.println("Removing 5");
        tree.remove(5);
        if (tree.contains(5)) {
            System.out.println("5 is still in the tree!!!");
        } else {
            System.out.println("5 was removed");
        }

        System.out.println("Checking for the following: 8, 1, 7");
        if (!tree.contains(8)) {
            System.out.println("8 is missing!");
        }
        if (!tree.contains(1)) {
            System.out.println("1 is missing!");
        }
        if (!tree.contains(7)) {
            System.out.println("7 is missing!");
        }
    }
}
