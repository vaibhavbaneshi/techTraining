package linkedList;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyLinkedList {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        for(Node current = head;current != null;current = current.next) {
            map.put(current,new Node(current.val));
        }
        for(Node current = head;current != null;current = current.next) {
            Node newNode = map.get(current);
            newNode.next = map.get(current.next);
            newNode.random = map.get(current.random);
        }
        return map.get(head);
    }

    public Node approach_2(Node start) {
        Node next;
        for(Node current = start;current != null;current = current.next) {
            next = current.next;
            current.next = new Node(current.val);
            current.next.next = next;
        }
        for(Node current = start;current != null;current = current.next) {
            current.next.random = current.random != null ? current.random.next : null;
        }
        Node old_pointer = start;
        Node new_pointer = start.next;
        Node old_head = start.next;
        while(old_pointer != null) {
            old_pointer.next = old_pointer.next.next;
            new_pointer.next = new_pointer.next != null ? new_pointer.next.next : null;
            old_pointer = old_pointer.next;
            new_pointer = new_pointer.next;
        }
        return old_head;
    }

    public static void main(String[] args) {
        
    }
}
