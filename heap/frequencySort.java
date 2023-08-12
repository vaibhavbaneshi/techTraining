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
        return this.key - o.value;
    }
}

public class frequencySort {

    public static ArrayList<Integer> freqSort(int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int count = 0;
        map.put(1,arr[0]);
        for(int e : arr) {
            if(map.containsValue(e)) {
                map.put(count+1,e);
            }
            else {
                map.put(1,e);
                count = 1;
            }
        }

        System.out.println(map);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,4};
        ArrayList<Integer> list = freqSort(arr);
        System.out.println(list);
    }
}
