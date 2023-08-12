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

public class countNode {
    
    int countNodeTree(binaryTreeNode<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter =1;
        counter += countNodeTree(root.left);
        counter += countNodeTree(root.right);
        return counter;
    }

    public static void main(String[] args) {
        countNode obj = new countNode();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        System.out.println("PreOrder : ");
        obj.countNodeTree(root);
    }
}
