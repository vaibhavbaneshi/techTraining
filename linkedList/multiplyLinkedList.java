package linkedList;

public class multiplyLinkedList {
    public long multiplyTwoLists(ListNode l1,ListNode l2){
    
        //Note: The output could be large take modulo 109+7.
      long n1 = 0;
      long n2 = 0;
      ListNode temp = l1;
      long N = 1000000007;
      while(temp != null) {
          n1 = (n1*10)%N + temp.data;
          temp = temp.next;
      }
      
      temp = l2;
      
      while(temp != null) {
          n2 = (n2*10)%N + temp.data;
          temp = temp.next;
      }
      return (n1%N)*(n2%N)%N;
 }
}
