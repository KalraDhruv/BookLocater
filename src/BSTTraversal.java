import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BSTTraversal {

    public void printTree(Node<Integer> root,int level){
        if(root == null){
            return;
        }
        for(int i =0;i<level;i++){
            System.out.print("|");
        }
        System.out.println(root.data);
        printTree(root.left,level+1);
        printTree(root.right,level+1);

    }
    public Node<Integer> treeByInOrder(int[] array){
        Arrays.sort(array);
        return createTree(array);
    }
    public Node<Integer> treeByPreOrder(int[] array){
        Arrays.sort(array);
        return createTree(array);
    }
    public Node<Integer> createTree(int[] array){
        if(array.length>2) {
            Node<Integer> node = new Node<>();
            int rootIndex = array.length / 2;
            node.data = array[rootIndex];
            int[] passArrayLeft= new int[array.length/2];
            int[] passArrayRight = new int[array.length - array.length/2 - 1];
            System.arraycopy(array, 0, passArrayLeft, 0, rootIndex);
            System.arraycopy(array, rootIndex+1,passArrayRight, 0, array.length-1-array.length/2);
            node.left = createTree(passArrayLeft);
            node.right=createTree(passArrayRight);
            return node;
        }else if(array.length == 2){
            Node<Integer> node = new Node<>();
            int rootIndex = array.length / 2;
            node.data = array[rootIndex];
            int[] passArrayLeft= new int[array.length/2];
            System.arraycopy(array, 0, passArrayLeft, 0, rootIndex);
            node.left = createTree(passArrayLeft);
            node.right = null;
            return node;
        }else if(array.length == 1){
            Node<Integer> node = new Node<>();
            node.data = array[0];
            node.left = null;
            node.right =null;
            return node;
        }
        return null;
    }

}
