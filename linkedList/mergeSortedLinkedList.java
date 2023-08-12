package linkedList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class mergeSortedLinkedList<T> {
    private Node<T> start;
    int count=0;

    public void insert(Node<T> node) {
        if(start == null) {
            start = node;
            count++;
            return;
        }

        if(start.next == null) {
            count++;
            start.next = node;
            return;
        }

        Node<T> currNode = start;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
        count++;
    }

    public Node<Integer> mergeTwoLists(Node<Integer> list1,Node<Integer> list2) {
        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
                }
                else{
                    list2.next=mergeTwoLists(list1,list2.next);
                    return list2;
                }
            }
            if(list1==null)
                return list2;
            return list1;
    }

    public static void main(String[] args) {
        mergeSortedLinkedList<Integer> obj1 = new mergeSortedLinkedList<>();
        obj1.insert(new Node<>(1));
        obj1.insert(new Node<>(4));
        obj1.insert(new Node<>(6));

        mergeSortedLinkedList<Integer> obj2 = new mergeSortedLinkedList<>();
        obj2.insert(new Node<>(2));
        obj2.insert(new Node<>(3));
        obj2.insert(new Node<>(5));

        Node<Integer> head1 = obj1.start;
        Node<Integer> head2 = obj2.start;

        Node<Integer> head3 = obj1.mergeTwoLists(head1, head2);

        while(head3 != null){
            System.out.print(head3.data+" ");
            head3 = head3.next;
        }
    }
}
