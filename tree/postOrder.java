package tree;

class binaryTreeNode<T> {
    T data;
    binaryTreeNode<T> left;
    binaryTreeNode<T> right;

    binaryTreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

public class postOrder {

    void postOrderTree(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        postOrderTree(root.left);
        postOrderTree(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        postOrder obj = new postOrder();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        System.out.println("PostOrder : ");
        obj.postOrderTree(root);
    }
}
