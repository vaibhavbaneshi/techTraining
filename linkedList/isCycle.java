package linkedList;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class isCycle<T> {

    private Node<T> start;

    public void insert(Node<T> node) {
        if(start == null) {
            start = node;
            return;
        }

        if(start.next == null) {
            start.next = node;
            return;
        }

        Node<T> newNode = start;
        while(newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = node;
    }

    public void createLoop(int pos) {
        if(start == null) {
            return;
        }

        if(start.next == null) {
            return;
        }

        Node<T> newNode = start,currNode = start;
        while(newNode.next != null) {
            if(pos != 0) {
                currNode = currNode.next;
            }
            newNode = newNode.next;
            pos--;
        }
    }

    public boolean isLoop() {
        if(start == null || start.next == null) {
            return false;
        }

        Node<T> slow = start;
        Node<T> fast = start;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(start == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        isCycle<Integer> obj = new isCycle<>();
        obj.insert(new Node<>(1));
        obj.insert(new Node<>(2));
        obj.insert(new Node<>(3));
        obj.insert(new Node<>(4));
        obj.insert(new Node<>(5));
        obj.insert(new Node<>(6));
        obj.insert(new Node<>(7));

        obj.createLoop(3);

        System.out.println(obj.isLoop());
    }
}
