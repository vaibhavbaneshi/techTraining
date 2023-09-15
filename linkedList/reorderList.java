package linkedList;

class ListNode {
    int data;
    ListNode next;
    ListNode head1;
    ListNode head2;

    ListNode(int data) {
        this.data = data;
    }
}

public class reorderList {

    public static ListNode midNode(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode secLastNode = head;
        ListNode lastNode = head.next;

        while(lastNode.next != null) {
            secLastNode = secLastNode.next;
            lastNode = lastNode.next;
        }

        ListNode temp = lastNode;
        while(lastNode != head) {
            lastNode.next = secLastNode;
            lastNode = secLastNode;
            secLastNode = head;

            while(secLastNode.next != lastNode) {
                secLastNode = secLastNode.next;
            }
        }
        head.next = null;
        head = temp;

        return head;
    }

    public static void reOrder(ListNode head) {
        if(head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secHead = slow.next;
        slow.next = null;
        secHead = reverse(secHead);
        
        while(secHead != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = secHead.next;

            head.next = secHead;
            secHead.next = temp1;

            head = temp1;
            secHead = temp2;
        }
    }
    
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
    }
}
