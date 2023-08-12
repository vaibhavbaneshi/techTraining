package linkedList;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class checkIntersection {
    public Node<Integer> getIntersectionNode(Node<Integer> headA, Node<Integer> headB) {
        Node<Integer> newNode1 = headA;
        Node<Integer> newNode2 = headB;
        int count1=0,count2=0;

        while(newNode1 != null) {
            count1++;
            newNode1 = newNode1.next;
        }

        while(newNode2 != null) {
            count2++;
            newNode2 = newNode2.next;
        }

        if(count1 > count2) {
            count1 -= count2;
            Node<Integer> temp = headA;
            while(count1 != 0) {
                temp = temp.next;
                count1--;
            }
            headA = temp;
        }
        else {
            count2 -= count1;
            Node<Integer> temp = headB;
            while(count2 != 0) {
                temp = temp.next;
                count2--;
            }
            headB = temp;
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
