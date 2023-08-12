package queue;

import java.util.LinkedList;
import java.util.Queue;

public class josephusProblem {
    static Queue<Integer> q = new LinkedList<>();
    public static void josephusProblemSolve(int n,int k) {
        for(int i=1;i<=n;i++) {
            q.offer(i);
        }
        while(true) {
            for(int i=0;i<k;i++) {
                if(i == k-1) {
                    int x = q.poll();
                    if(q.isEmpty()) {
                        System.out.println(x);
                        return;
                    }
                }
                else {
                    q.offer(q.remove());
                }
            }
        }
    }

    public static void main(String[] args) {
        josephusProblemSolve(7,4);
    }
}
