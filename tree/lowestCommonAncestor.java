package tree;

class TreeNode {
    int data;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int data) {
        this.data = data;
    }
}

public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestorTree(TreeNode root,TreeNode p,TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestorTree(root.left, p, q);
        TreeNode right = lowestCommonAncestorTree(root.right, p, q);

        if(left == null) {
            return right;
        }

        else if(right == null) {
            return left;
        }

        else {
            return root;
        }
    } 

    public static void main(String[] args) {
        
    }
}
