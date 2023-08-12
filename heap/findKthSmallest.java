package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class findKthSmallest {
    
    public static int findKthSmallestNumber(int[] arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++) {
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++) {
            if(pq.peek() > arr[i]) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {20,10,60,30,50,40};
        System.out.println(findKthSmallestNumber(arr, 3));
    }
}
