public class BinarySearchTree<T> {
  private class BinarySearchNode{
    private T data;
    private BinarySearchNode<T> left;
    private BinarySearchNode<T> right;
    public QueueNode(T data) {
      this.data = data;
    }
    private BinarySearchNode<T> root;
  }
}
