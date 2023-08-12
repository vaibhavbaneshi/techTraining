package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class checkBinary {
    public static boolean compare(int[] arr1 , int[] arr2) {
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> q = new LinkedList<>();
        if(arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        for(int e : arr1) {
            stack.push(e);
        }

        for(int e : arr2) {
            q.offer(e);
        }
        int digit=0;
        while(true) {
            if(stack.isEmpty() || q.isEmpty()) {
                break;
            }
            if(q.peek() == stack.peek()) {
                digit=0;
                q.poll();
                stack.pop();
            }
            if(digit >= q.size()) {
                break;
            }
            else {
                digit++;
                q.offer(q.poll());
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0,1,0};
        int[] arr2 = {0,1,1,1};
        String s = compare(arr1,arr2) ? "Match succesfull" : "No Match";
        System.out.println(s);
    }
}
