
class IntegerTree
{
    IntegerNode root;

    public IntegerTree()
    {
        root = null;
    }

    public void add(int value)
    {
        if (root == null)
            root = new IntegerNode(value, null, null);
        else
            root.insertValue(value);
    }

    public int size()
    {
        if (root == null)
            return 0;
        else
            return root.getNodeCount();
    }

    public void printPreorder()
    {
        System.out.print("[");
        if (root != null)
            root.printPreorder();
        else
            System.out.print(" - ");
        System.out.println("]");
    }

    public void printInorder()
    {
        System.out.print("[");
        if (root != null)
            root.printInorder();
        else
            System.out.print(" - ");
        System.out.println("]");
    }

    public void printPostorder()
    {
        System.out.print("[");
        if (root != null)
            root.printPostorder();
        else
            System.out.print(" - ");
        System.out.println("]");
    }

    public static void main(String [] args)
    {
        IntegerTree tree = new IntegerTree();
        tree.add(5);
        tree.add(3);
        tree.add(1);
        tree.add(8);
        tree.add(6);
        tree.add(7);
        tree.add(4);
        System.out.print("Preorder  - ");
        tree.printPreorder();
        System.out.print("Inorder   - ");
        tree.printInorder();
        System.out.print("Postorder - ");
        tree.printPostorder();
    }

    static private class IntegerNode
    {
        int value;
        IntegerNode lesserNode;
        IntegerNode greaterNode;
        public IntegerNode(int value, IntegerNode lesser, IntegerNode greater)
        {
            this.value = value;
            lesserNode = lesser;
            greaterNode = greater;
        }
        public int getNodeCount()
        {
            int count = 1;
            if (lesserNode != null)
                count += lesserNode.getNodeCount();

            if (greaterNode != null)
                count += greaterNode.getNodeCount();

            return count;
        }

        public void insertValue(int value)
        {
            if (this.value == value)
                return; // Value already exists in tree
            if (value < this.value && lesserNode == null)
                lesserNode = new IntegerNode(value, null, null);
            else if (value < this.value)
                lesserNode.insertValue(value);
            else if (value > this.value && greaterNode == null)
                greaterNode = new IntegerNode(value, null, null);
            else // if (value > this.value) // Not needed
                greaterNode.insertValue(value);
        }

        public void printPreorder()
        {
            System.out.print(value + ", ");
            if (lesserNode != null)
                lesserNode.printPreorder();
            if (greaterNode != null)
                greaterNode.printPreorder();
        }

        public void printInorder()
        {
            if (lesserNode != null)
                lesserNode.printInorder();
            System.out.print(value + ", ");
            if (greaterNode != null)
                greaterNode.printInorder();
        }

        public void printPostorder()
        {
            if (lesserNode != null)
                lesserNode.printPostorder();
            if (greaterNode != null)
                greaterNode.printPostorder();
            System.out.print(value + ", ");
        }
    }
}
