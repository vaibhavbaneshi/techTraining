package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueueUsingStack {
    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        // if(q.isEmpty()) {
        //     System.out.println("The Queue is empty : ");
        //     return;
        // }
        while(!q.isEmpty()) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            q.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }
}
