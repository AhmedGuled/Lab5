class Main {
    public static void main(String[] args) {

        BST<Integer> lab5Tree = new BST<>();

        lab5Tree.insert(13);
        lab5Tree.insert(22);
        lab5Tree.insert(36);
        lab5Tree.insert(5);
        lab5Tree.insert(48);
        lab5Tree.insert(17);
        lab5Tree.insert(39);
        lab5Tree.insert(2);
        lab5Tree.insert(26);
        lab5Tree.insert(40);
        lab5Tree.insert(29);
        lab5Tree.insert(34);
        lab5Tree.insert(10);

        // Delete the value 17
        lab5Tree.delete(17);

        // Traverse and output the values using inorder (sorted)
        lab5Tree.preorder();

        // Traverse and output the values using postorder
        lab5Tree.postorder();

        // Traverse and output the values using preorder
        lab5Tree.preorder();

        // Display the result of a search for the value 36
        System.out.println(lab5Tree.search(36));

        // Display the result of a search for the value 37
        System.out.println(lab5Tree.search(37));

        for (BST.TreeNode<Integer> node : lab5Tree.path(2)) {
            System.out.print(node.element + " ");
        }

        for (BST.TreeNode<Integer> node : lab5Tree.path(34)) {
            System.out.print(node.element + " ");
        }

    }
}