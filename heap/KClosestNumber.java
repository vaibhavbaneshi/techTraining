package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int key;
    int value;
    Pair(int key,int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair o) {
        return this.key - o.key;
    }
}

public class KClosestNumber {

    public static ArrayList<Integer> findClosest(int[] arr,int x,int k) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++) {
            pq.offer(new Pair(Math.abs(arr[i]-x),arr[i]));

            if(pq.size() > k) {
                pq.poll();
            }
        }

        while(!pq.isEmpty()) {
            list.add(pq.poll().value);
        }

        return list;
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> list = findClosest(arr, 7, 3);
        System.out.println(list);
    }
}
