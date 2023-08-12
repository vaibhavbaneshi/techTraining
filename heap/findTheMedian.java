package heap;

import java.util.*;

public class findTheMedian {
    
    public static int findMedian(int[] arr) {
        int n = arr.length;

        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq_min = new PriorityQueue<>();

        for(int i=0;i<n/2+1;i++) {
            pq_max.offer(arr[i]);
        }

        for(int i=n/2+1;i<arr.length;i++) {
            pq_min.offer(arr[i]);
        } 
        
        if(arr.length%2 != 0) {
            return pq_max.peek();
        }

        else {
            return (pq_max.peek() + pq_min.peek())/2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11};
        System.out.println(findMedian(arr));
    }
}
