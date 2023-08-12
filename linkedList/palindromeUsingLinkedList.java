package linkedList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class palindromeUsingLinkedList<T> {
    private Node<T> start;
    int count=0;
    public void insert(Node<T> node) {
        if(start == null) {
            start = node;
            count++;
            return;
        }

        if(start.next == null) {
            count++;
            start.next = node;
            return;
        }

        Node<T> currNode = start;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
        count++;
    }

    public boolean checkPalindrome() {
        if(start == null) {
            return false;
        }

        if(start.next == null) {
            return true;
        }

        Node<T> slow = start.next;
        Node<T> fast = start.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<T> prev = null;
        Node<T> node2 = start;
        Node<T> node3 = node2.next;

        while(node2.next != slow) {
            node2.next = prev;
            prev = node2;
            node2 = node3;
            node3 = node3.next;
        }
        if(count%2 != 0) {
            slow = slow.next;
        }
        node2.next = prev;

        // System.out.println(node2.next.data+" "+node2.data+" "+slow.next.data);

        // Node<T> temp = node2;
        // while(temp != null) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        // System.out.println();
        // Node<T> temp1 = slow;
        // while(temp1 != null) {
        //     System.out.print(temp1.data+" ");
        //     temp1 = temp1.next;
        // }

        while(node2 != null || slow != null) {
            if(node2.data != slow.data) {
                return false;
            }
            node2 = node2.next;
            slow = slow.next;
        }

        return true;

    }

    public static void main(String[] args) {
        palindromeUsingLinkedList<Integer> obj = new palindromeUsingLinkedList<>();
        obj.insert(new Node<>(1));
        obj.insert(new Node<>(1));
        obj.insert(new Node<>(2));
        obj.insert(new Node<>(0));
        obj.insert(new Node<>(2));
        obj.insert(new Node<>(1));
        obj.insert(new Node<>(1));
        System.out.println(obj.checkPalindrome());
        // System.out.println(count);
    }
}
