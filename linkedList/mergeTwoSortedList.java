package linkedList;

public class mergeTwoSortedList {
    
    public static ListNode merge(ListNode head1,ListNode head2) {

        if(head1 != null && head2 != null) {
            return null;
        }

        if(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                head1.next = merge(head1.next,head2);
                return head1;
            }
            else {
                head2.next = merge(head1,head2.next);
                return head2;
            }
        }

        if(head1 == null) {
            return head2;
        }

        return head1;
    }
}
