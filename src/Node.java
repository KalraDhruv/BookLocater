public class Node <T>{
    public Node<T> right;
    public Node<T> left;
    public T data;
    Node(){
       data = null;
       right= null;
       left = null;
    }
    Node(T data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
