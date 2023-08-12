package tree;

public class invertTree {
    public TreeNode invert(TreeNode root) {
        if(root == null)    
            return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }

    public static void main(String[] args) {
        
    }
}
