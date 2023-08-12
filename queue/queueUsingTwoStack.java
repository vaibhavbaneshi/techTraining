package queue;

import java.util.Stack;

class queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    public static void add(int data) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static int remove() {
        if(s1.isEmpty()) {
            System.out.println("The stack is empty : ");
            return -1;
        }
        int x = s1.pop();
        System.out.println("The item popped is : ");
        return x;
    }
}

public class queueUsingTwoStack {
    
    public static void main(String[] args) {
        
    }
}
