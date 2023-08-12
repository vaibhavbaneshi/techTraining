package tree;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

class BST {
    int data;
    BST left = null;
    BST right = null;

    BST(int data) {
        this.data = data;
    }
}

public class BSTOperations {
    
    BST insert(BST root,int data) {
        if(root == null) {
            root = new BST(data);
            return root;
        }

        if(root.data > data) {
            root.left = insert(root.left,data);
        }

        else {
            root.right = insert(root.right,data);
        }

        return root;
    }

    boolean searchNode(BST root,int data) {
        if(root == null) {
            return false;
        }

        if(root.data == data) {
            return true;
        }

        if(root.data < data) {
            return searchNode(root.right,data);
        }
        
        return searchNode(root.left, data);
    }

    int minElement(BST root,int data) {
        int minElement = root.data;
        while(root.left != null) {
            minElement = root.data;
            root = root.right;
        }
        return minElement;
    }

    int maxElement(BST root,int data) {
        int maxElement = root.data;

        while(root.right != null) {
            maxElement = root.data;
            root = root.right;
        }
        return maxElement;
    }

    void add(BST root,int data) {
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

    void inOrder(BST root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    BST deleteNode(BST root,int data) {
        if(root == null) {
            return null;
        }

        if(root.data > data) {
            root.left = deleteNode(root.left, data);
        }

        else if(root.data < data) {
            root.right = deleteNode(root.right, data);
        }

        else {
            if(root.left == null && root.right == null) {
                return null;
            }

            else if(root.right == null) {
                return root.left;
            }

            else if(root.left == null) {
                return root.left;
            }

            BST inOrderSuccessor = inOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = deleteNode(root.right, data); 
        }
        return root;
    }

    BST inOrderSuccessor(BST root) {
        // leftMost node in the rightSubTree
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    int countNodes(BST root) {
        if(root == null) {
            return 0;
        }
         int leftSubTree = countNodes(root.left);
         int rightSubTree = countNodes(root.right);

         return leftSubTree + rightSubTree + 1;
    }

    int sumOfNodes(BST root) {
        if(root == null) {
            return 0;
        }
         int leftSubTreeSum = sumOfNodes(root.left);
         int rightSubTreeSum = sumOfNodes(root.right);

         return leftSubTreeSum + rightSubTreeSum + root.data;
    }

    int heightOfTree(BST root) {
        if(root == null) {
            return 0;
        }

        int leftSubTreeHeight = heightOfTree(root.left);
        int rightSubTreeHeight = heightOfTree(root.right);

        int treeHeight = Math.max(leftSubTreeHeight,rightSubTreeHeight);

        return treeHeight + 1;
    }

    int diameter(BST root) {
        if(root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter,Math.max(left,right));
    }

    void printRange(BST root,int X,int Y) {
        if(root == null) {
            return;
        }

        if(root.data >= X && root.data <= Y) {
            printRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printRange(root.right, X, Y);
        }

        else if(root.data >= Y) {
            printRange(root.left, X, Y);
        }

        else {
            printRange(root.right, X, Y);
        }
    }

    void printPath(ArrayList<Integer> list) {
        System.out.println(list);
    }

    void rootToLeafPath(BST root,ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        else {
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }

    void print(BST root) {
        inOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BSTOperations obj = new BSTOperations();
        int[] arr = {8,5,3,1,4,6,10,11,14};
        BST root = null;

        for(int e : arr) {
            root = obj.insert(root,e);
        }

        obj.print(root);

        obj.add(root,7);
        obj.print(root);

        System.out.println("Search for item : ");
        String isContain = obj.searchNode(root, 5) ? "The Tree contains the value" : "The Tree does not contain the value";
        System.out.println(isContain);

        obj.deleteNode(root, 7);
        System.out.println("After deleting the node cointaing data : "+7);
        obj.print(root);
         
        System.out.println("The values within range are : ");
        obj.printRange(root,3,12);
        System.out.println(); 

        System.out.println("The paths are : ");
        obj.rootToLeafPath(root,new ArrayList<>());
    }
}
