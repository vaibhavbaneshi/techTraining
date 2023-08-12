package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

class Pair {
    int indx;
    TreeNode node;

    Pair(int indx,TreeNode node) {
        this.indx = indx;
        this.node = node;
    }
}

public class topViewTree {

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

    public static void topView(TreeNode root) {

        if(root == null) {
            return;
        }
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        q.offer(new Pair(0, root));
        while(!q.isEmpty()) {
            Pair p = q.poll();
            
            int indx = p.indx;
            TreeNode node = p.node;

            if(map.get(indx) == null) 
                map.put(indx,node.data);

            if(node.left != null) {
                q.offer(new Pair(indx-1, node.left));
            }

            if(node.right != null) {
                q.offer(new Pair(indx+1, node.right));
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = insert(nodes);

        topView(root);
    }
}