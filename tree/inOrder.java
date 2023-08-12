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

public class inOrder {
    
    void inOrderTree(binaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        inOrderTree(root.left);
        System.out.print(root.data+" ");
        inOrderTree(root.right);
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
        inOrder obj = new inOrder();
        binaryTreeNode<Integer> root = new binaryTreeNode<>(null);
        System.out.println("InOrder : ");
        obj.inOrderTree(root);
    }
}
