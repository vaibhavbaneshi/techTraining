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

public class leftViewOfTree {
    
    static int maxLevel=0;
    void leftViewTree(binaryTreeNode<Integer> root,int level) {
        if(root == null) {
            return;
        }
        if(maxLevel < level) {
            System.out.print(root.data+" ");
            maxLevel = level;
        }
        leftViewTree(root.left, level+1);
        leftViewTree(root.right, level+1);
    }

    static void leftViewOfTreeIterative(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        LinkedList<binaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                binaryTreeNode<Integer> current = queue.removeFirst();
                if(i == 0) {
                    System.out.print(current.data+" ");
                }
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
