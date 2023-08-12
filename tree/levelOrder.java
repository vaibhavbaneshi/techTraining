package tree;

import java.util.LinkedList;

class binaryTreeNode<T> {
    T data;
    binaryTreeNode<T> left;
    binaryTreeNode<T> right;

    binaryTreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

public class levelOrder {
    
    void levelOrderTree(binaryTreeNode<Integer> root) {
        LinkedList<binaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            binaryTreeNode<Integer> node = queue.removeFirst();
            System.out.println(node.data);
            if(node.left != null) {
                queue.addLast(node.left);
            }
            if(node.right != null) {
                queue.addLast(node.right);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
