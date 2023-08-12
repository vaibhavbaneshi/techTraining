package heap;

import java.util.PriorityQueue;

public class findKthLargest {

    public static int findKthLargestNumber(int[] arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++) {
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++) {
            if(pq.peek() < arr[i]) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        return pq.peek();
    }
    
    public static void main(String[] args) {
        int[] arr = {20,10,60,30,50,40};
        System.out.println(findKthLargestNumber(arr, 3));
    }
}
