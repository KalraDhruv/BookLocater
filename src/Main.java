//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BSTTraversal tree = new BSTTraversal();
        int[] array = {15,10,20,8,12,17,25};
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder={9, 3, 15, 20, 7};
        tree.printTree(tree.treeByInOrder(inorder),0);

        Node<Integer> root = tree.createTree(array);
        tree.printTree(root,0);


    }
}