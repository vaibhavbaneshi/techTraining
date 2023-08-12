package tree;

import java.util.HashMap;
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

class Pair {
    int indx;
    TreeNode node;

    Pair(int indx,TreeNode node) {
        this.indx = indx;
        this.node = node;
    }
}

public class burnTree {
    
    static int indx = -1;
    public static TreeNode insert(int[] nodes) {
        indx++;

        if(nodes[indx] == -1) {
            return null;
        }

        TreeNode newNode = new TreeNode(nodes[indx]);
        newNode.left = insert(nodes);
        newNode.right = insert(nodes);

        return newNode;
    }

    public static void childToParent(TreeNode root,HashMap<TreeNode,TreeNode> map) {

        if(root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            TreeNode current = q.poll();

            if(current.left != null) {
                map.put(current.left, current);
                q.offer(current.left);
            }

            if(current.right != null) {
                map.put(current.right, current);
                q.offer(current.right);
            }
        }        
    }

    public static int burn(TreeNode node,HashMap<TreeNode,TreeNode> map) {

        int time = 0;

        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer,Boolean> visMap = new HashMap<>();
        q.offer(node);

        while(!q.isEmpty()) {
            int qsize = q.size();
            int t = 0;

            for(int i=0;i<qsize;i++) {
                TreeNode current = q.poll();
                if(map.get(current) != null) {
                    t = 1;
                    TreeNode parent = map.get(current);
                    q.offer(parent);
                    visMap.put(parent.data,true);
                }

                visMap.put(current.data, true); 
                if(current.left != null) {
                    t = 1;
                    q.offer(current.left);
                    visMap.put(current.left.data,true);
                }

                if(current.right != null) {
                    t = 1;
                    q.offer(current.right);
                    visMap.put(current.right.data,true);
                }
            }

            if(t == 1) {
                time++;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,7,-1,-1,-1,3,5,-1,-1,6,-1,-1};
        TreeNode root = insert(nodes);
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        childToParent(root,map);
        System.out.println("Time Taken to burn Tree is : "+burn(root,map)+" sec");
    }
}
