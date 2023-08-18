class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
    }
}

class practise {

    public static BST insert(BST root,int data) {

        if(root == null) {
            root = new BST(data);
            return root;
        }

        if(root.data < data) {
            root.right = insert(root.right,data);
        }

        else {
            root.left = insert(root.left,data);
        }

        return root;
    }

    public static boolean searchNode(BST root,int data) {

        if(root == null) {
            return false;
        }

        if(root.data == data) {
            return true;
        }

        if(root.data < data) {
            return searchNode(root.left, data); 
        }

        else {
            return searchNode(root.right, data);
        }
    }

    public static int minElement(BST root) {

        if(root == null)
            return -1;

        while(root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    public static int maxElement(BST root) {

        if(root == null) {
            return -1;
        }

        while(root.right != null) {
            root = root.right;
        }

        return root.data;
    }

    public static void add(BST root,int data) {

        if(root.data < data) {
            if(root.right == null) {
                BST node = new BST(data);
                root.right = node;
            }

            else {
                add(root.right,data);
            }
        }
        else {
            if(root.left == null) {
                BST node = new BST(data);
                root.left = node;
            }

            else {
                add(root.left,data);
            }
        }
    }

    BST deleteNode(BST root,int data) {

        if(root == null) {
            return null;
        }

        else if(root.data < data) {
            root.right = deleteNode(root.right, data);
        }

        else if(root.data > data) {
            root.left = deleteNode(root.left, data);
        }

        else {
            if(root.left == null && root.right == null) {
                return null;
            }

            else if(root.left == null) {
                return root.right;
            }

            else if(root.right == null) {
                return root.left;
            }

            BST inOrderSuccessor = inOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = deleteNode(root.right, data);
        }
        return root;
    }

    BST inOrderSuccessor(BST root) {
        
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static int countNodes(BST root) {

        if(root == null) {
            return 0;
        }

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }

    public static int sumOfNodes(BST root) {

        if(root == null) {
            return -1;
        }

        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return left + right + root.data;
    }

    public static int heightOfTree(BST root) {

        if(root == null) {
            return 0;
        }

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        return Math.max(left,right) + 1;
    }

    public static int diameterOfTree(BST root) {

        if(root == null) {
            return 0;
        }

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter,Math.max(left,right));
    }

    public static void printRange(BST root,int X,int Y) {
        
        if(root == null) {
            return;
        }

        if(root.data > X && root.data < Y) {
            printRange(root.left, X, Y);
            System.out.print(root.data);
            printRange(root.right, X, Y);
        }

        if(root.data > Y) {
            printRange(root.left, X, Y);
        }

        if(root.data < X) {
            printRange(root.right, X, Y);
        }
    }


}