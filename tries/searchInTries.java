package tries;
public class searchInTries {
    
    static class Node {
        Node[] children;
        boolean isTerminal;

        public Node() {
            children = new Node[26];
            for(int i=0;i<26;i++) {
                children[i] = null;
            }
            isTerminal = false;
        }
    }

    static Node root = new Node();

    public static void insert(String str) {
        Node currNode = root;
        for(int i=0;i<str.length();i++) {
            int index = str.charAt(i) - 'a';

            if(currNode.children[index] == null) {
                currNode.children[index] = new Node();
            }

            if(i == str.length()-1) {
                currNode.children[index].isTerminal = true;
            }

            currNode = currNode.children[index];
        }
    }

    public static boolean search(String word) {
        Node currNode = root;

        for(int i=0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            Node node = currNode.children[index];
            if(node == null) {
                return false;
            }
            if(i == word.length()-1 && node.isTerminal == false) {
                return false;
            }
            currNode = currNode.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] str = {"bad","bag","ape","apple","app"};
        for(String e : str) {
            insert(e);
        }
        System.out.println(search("apps"));
    }
}
