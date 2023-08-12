package linkedList;
import java.util.PriorityQueue;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sortLinkedList0s1s2s {
    
    static ListNode segregate(ListNode head) {
        // add your code here
        if(head == null) {
            return head;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode temp = head;
        
        while(temp != null) {
            pq.offer(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        
        while(!pq.isEmpty()) {
            temp.data = pq.poll();
            temp = temp.next;
        }
        return head;
    }
}
