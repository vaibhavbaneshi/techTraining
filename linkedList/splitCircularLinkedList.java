package linkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

public class splitCircularLinkedList {

    ListNode start;
    ListNode tail;

    public void insert(int data) {
        if(start == null) {
            tail = start = new ListNode(data);
            return;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;
    }

    public void splitCircular() {
        ListNode slow = start;
        ListNode fast = start;

        while(fast.next != start && fast.next.next != start) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next == start) {
            fast = fast.next;
        }

        ListNode start_1 = start;
        ListNode start_2 = null;

        if(start.next != start) {
            start_2 = slow.next;
        }

        fast.next = slow.next;
        slow.next = start;
        print(start_1);
        System.out.println("============");
        print(start_2);
    }

    void print(ListNode start) {
        ListNode temp = start;
        while(temp.next != start) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        splitCircularLinkedList obj = new splitCircularLinkedList();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        obj.tail.next = obj.start;

        obj.splitCircular();
    }
}
