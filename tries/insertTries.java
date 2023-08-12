package tries;

public class insertTries {
    
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
    static void insert(String str) {
        Node currNode = root;
        for(int i=0;i<str.length();i++) {
            int index = str.charAt(i) - 'a';
            if(currNode.children[index] == null) {
                currNode.children[index] = new Node();  
            }

            if(i == str.length()-1) {
                System.out.println("word is inserted : "+str);
                currNode.children[index].isTerminal = true;
            }
            currNode = currNode.children[index];
        }
    }

    public static void main(String[] args) {
        String[] str = {"bag","dog","cat"};
        for(String e : str) {
            insert(e);
        }
    }
}
