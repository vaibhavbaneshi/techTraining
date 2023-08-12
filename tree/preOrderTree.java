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

public class preOrderTree {

    void preOrder(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void print(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        output += root.data + " => ";
        if(root.left != null) {
            output += " L : "+root.left.data;
        }
        if(root.right != null) {
            output += " R : "+root.right.data;
        }
        System.out.print(output+" ");
        print(root.left);
        print(root.right);
    }


    public static void main(String[] args) {
        preOrderTree obj = new preOrderTree();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        System.out.println("PreOrder : ");
        obj.preOrder(root);
    }
}
