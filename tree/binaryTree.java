package tree;
import java.util.Scanner;

class binaryTreeNode<T> {
    T data;
    binaryTreeNode<T> left;
    binaryTreeNode<T> right;

    binaryTreeNode(T data) {
        this.data = data;
        left = right = null;
    }
}

public class binaryTree {
    String msg = "root";
    binaryTreeNode<Integer> insert() {
        System.out.println("Enter the : "+msg+" data ");
        int data = new Scanner(System.in).nextInt();
        if(data == -1) {
            return null;
        }

        binaryTreeNode<Integer> node = new binaryTreeNode<Integer>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
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
        binaryTree obj = new binaryTree();
        binaryTreeNode<Integer> root = obj.insert();
        obj.print(root);
    }
}
