package tree;

import java.util.Stack;

class binaryTreeNode<T> {
    T data;
    binaryTreeNode<T> left;
    binaryTreeNode<T> right;

    binaryTreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

public class preOrderIterative {
    
    void preOrderIterativeTree(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        Stack<binaryTreeNode<Integer>> stack = new Stack<>();
        binaryTreeNode<Integer> current = root;
        while(!stack.isEmpty() || current != null) {
            if(!stack.isEmpty() && current == null) {
                stack.pop();
            }
            System.out.println(current.data);
            if(current.right != null) {
                stack.push(current.right);
            }
            current = current.left;
        }
    }

    public static void main(String[] args) {
        preOrderIterative obj = new preOrderIterative();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        System.out.println("PreOrder : ");
        obj.preOrderIterativeTree(root);
    }
}
