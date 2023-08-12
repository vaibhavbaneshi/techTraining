package linkedList;

public class deleteNodeSmallerThanRight {
    
    public static ListNode compute(ListNode head) {
        
        if(head == null) {
            return head;
        }

        ListNode temp = head;
        while(temp.next != null) {
            if(temp.data < temp.next.data) {
                temp.data = temp.next.data;
                temp.next = temp.next.next;
                temp = head;
            }
            else
                temp = temp.next;
        }

        return head;
    }
}
