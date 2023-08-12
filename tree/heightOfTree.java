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

public class heightOfTree {
    
    int height(binaryTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftTreeHeight = height(root.left);
        int rightTreeHeight = height(root.right);
        return Math.max(leftTreeHeight,rightTreeHeight) + 1;
    }
}
