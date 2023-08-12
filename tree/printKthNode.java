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

public class printKthNode {

    void printKthNodeTree(binaryTreeNode<Integer> root,int k) {
        if(root == null) {
            return;
        }
        if(k == 0) {
            System.out.println(root.data);
        }
        else {
            printKthNodeTree(root.left, k-1);
            printKthNodeTree(root.right, k-1);
        }
    }

    public static void main(String[] args) {
        printKthNode obj = new printKthNode();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        obj.printKthNodeTree(root,3);
    }
}
