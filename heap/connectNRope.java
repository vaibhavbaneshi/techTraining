package heap;

import java.util.PriorityQueue;

public class connectNRope {
    
    public static int connectRope(int[] arr) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) {
            pq.offer(arr[i]);
        }

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.offer(sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,4,8,6,9};
        System.out.println(connectRope(arr));
    }
}
