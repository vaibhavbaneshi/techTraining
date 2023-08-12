package linkedList;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode secLast = head;
        ListNode lastNode = head.next;

        while(lastNode.next != null) {
            secLast = secLast.next;
            lastNode = lastNode.next;
        }

        ListNode current = lastNode;
        while(lastNode != head) {
            lastNode.next = secLast;
            lastNode = secLast;
            secLast = head;

            while(secLast.next != lastNode) {
                secLast = secLast.next;
            }
        }
        head.next = null;
        head = current;

        return head;
    }
}
