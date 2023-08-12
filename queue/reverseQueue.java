package queue;

import java.util.LinkedList;
import java.util.Queue;

class queue {

    static void reverse(Queue<Integer> q) {
        if(q.isEmpty()) {
            return;
        }
        int firstElement = q.poll();
        reverse(q);
        q.offer(firstElement);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
}