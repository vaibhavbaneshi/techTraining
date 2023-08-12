package tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
} 

public class leftViewTree {
    static int indx = -1;
    public static TreeNode insert(int[] nodes) {

        if(nodes.length == 0) {
            return null;
        }

        indx++;

        if(nodes[indx] == -1) {
            return null;
        }

        TreeNode newNode = new TreeNode(nodes[indx]);
        newNode.left = insert(nodes);
        newNode.right = insert(nodes);

        return newNode;
    }

    public static void leftView(TreeNode root,int level,Queue<Integer> q) {

        if(root == null) {
            return;
        }

        if(level == q.size()) {
            q.offer(root.data);
        }

        leftView(root.left, level+1, q);
        leftView(root.right, level+1, q);

        while(!q.isEmpty()) {
            System.out.print(q.poll()+" ");
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = insert(nodes);

        Queue<Integer> q = new LinkedList<>();
        leftView(root, 0, q);
    }
}
