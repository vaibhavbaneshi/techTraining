package tree;

class TreeNode {
    int data;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int data) {
        this.data = data;
    }
}

public class mirrorTree {
    
    public TreeNode swap(TreeNode node) {
        if(node == null) {
            return node;
        }

        TreeNode left = swap(node.left);
        TreeNode right = swap(node.right);

        TreeNode temp = left;
        left = right;
        right = temp;

        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
    }
}
