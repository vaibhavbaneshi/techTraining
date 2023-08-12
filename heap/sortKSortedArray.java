package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKSortedArray {
    
    public static ArrayList<Integer> sort(int[] arr,int k) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) {
            pq.offer(arr[i]);

            if(pq.size() == k) {
                list.add(pq.poll());
            }
        }

        while(!pq.isEmpty()) {
            list.add(pq.poll());
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,9,10};

        ArrayList<Integer> list = sort(arr,4);
        System.out.println(list);
    }
}
