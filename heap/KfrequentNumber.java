package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {

    int key;
    int value;

    public Pair(int key,int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair o) {
        return this.key - o.key;
    }
}

public class KfrequentNumber {
    
    public static ArrayList<Integer> findKFrequent(int[] arr,int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        Arrays.sort(arr);

        map.put(1,arr[0]);
        for(int e=1;e<arr.length;e++) {
            if(map.containsKey(arr[e])) {
                map.put(++count,arr[e]);
            }
            else {
                map.put(1,arr[e]);
                count = 1;
            }
        }

        for(int e : map.keySet()) {
            pq.offer(new Pair(e, map.get(e)));

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
        int[] arr = {1,1,1,3,2,2,4};
        ArrayList<Integer> list = findKFrequent(arr, 2);
        System.out.println(list);
    }
}
