package linkedList;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    Integer val;
    ListNode next;

    public ListNode(Integer val) {
        this.val = val;
        this.next = null;
    }
}

public class mergeKSortedLinkedList {
    
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++) {
            ListNode start = lists[i];

            while(start != null) {
                list.add(start.val);
                start = start.next;
            }
        }
        Collections.sort(list);
        ListNode ans = null;
        ListNode temp = null;

        for(Integer i : list) {
            if(temp == null) {
                temp = new ListNode(i);
                ans = temp;
            }
            else {
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        }
        return ans;
    }
}

