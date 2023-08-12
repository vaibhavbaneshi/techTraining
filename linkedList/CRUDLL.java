package linkedList;

class CRUDLL<T> {
    private NodeA<T> start;
    static int size=0;
    void insertBeg(NodeA<T> node) {
        if(start == null) {
            start = node;
            size++;
            return;
        }
        node.next = start;
        start = node;
        size++;
    }

    void insertLast(NodeA<T> node) {
        if(start == null) {
            start = node;
            return;
        }
        NodeA<T> temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    void insertAtMid(NodeA<T> node) {
        if(start == null) {
            start = node;
            return;
        }
        int index=1;
        int mid = (size/2);
        NodeA<T> temp = start;
        while(index != mid) {
            temp = temp.next;
            index++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void insertAtPos(NodeA<T> node,int pos) {
        if(start == null) {
            start = node;
            size++;
            return;
        }
        if(pos <= 0) {
            throw new RuntimeException("Position is Invalid");
        }
        if(pos == 1) {
            insertBeg(node);
            size++;
        }

        if(pos > 1) {
            int index=1;
            NodeA<T> temp = start;
            while(index != pos-1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    void deleteBeg(NodeA<T> node) {
        if(start == null) {
            System.out.println("The list is empty.");
            return;
        }
        start = start.next;
    }

    void deleteAtMid() {
        if(start == null) {
            System.out.println("The list is empty.");
            return;
        }
        int mid = size/2;
        int index = 1;
        NodeA<T> temp = start;
        while(index != mid-1) {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
        size--;
    }

    void midPoint() {
        NodeA<T> slow = start.next;
        NodeA<T> fast = start.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    void findTheKthNodeFromLast(int k) {
        if(start == null) {
            System.out.println("The list is empty : ");
            return;
        }
        int x = size - k + 1;
        NodeA<T> temp = start;
        for(int i=1;i<x;i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void KthNodeTwoPointer(int k) {
        if(start == null) {
            System.out.println("The list is empty : ");
            return;
        }
        NodeA<T> p = start;
        NodeA<T> q = start;

        for(int i=1;i<k;i++) {
            p = p.next;
        }

        while(p.next != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println(q.data);
    }

    void reverseLinkedList() {
        if(start == null) {
            System.out.println("The list is empty.");
            return;
        }

        if(start.next == null) {
            System.out.println(start.data);
            return;
        }

        NodeA<T> prev = null;
        NodeA<T> currNode = start;
        NodeA<T> nextNode = currNode.next;

        while(currNode.next != null) {
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        currNode.next = prev;
        start = currNode;
    }

    void print() {
        if(start == null) {
            return;
        }
        NodeA<T> temp = start;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CRUDLL<Integer> obj = new CRUDLL<>();
        obj.insertBeg(new NodeA<>(1));
        obj.insertLast(new NodeA<>(2));
        obj.insertLast(new NodeA<>(3));
        obj.insertLast(new NodeA<>(4));
        obj.insertAtMid(new NodeA<>(5));
        obj.insertAtPos(new NodeA<>(6),4);
        obj.insertLast(new NodeA<>(7));
        System.out.println("The size of list : ");
        System.out.println(size);
        System.out.println("The list : ");
        obj.print();
        // System.out.println("Delete the mid : ");
        // obj.deleteAtMid();
        obj.print();
        System.out.println("The mid point : ");
        obj.midPoint();
        System.out.println("The Kth node from last: ");
        obj.findTheKthNodeFromLast(3);
        System.out.println("The Kth Node two pointer approach : ");
        obj.KthNodeTwoPointer(3);
        System.out.println("Reversed Linked List : ");
        obj.reverseLinkedList();
        obj.print();
    }
}
