package linkedList;

public class isCycleNode {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        if(!isCycle) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
