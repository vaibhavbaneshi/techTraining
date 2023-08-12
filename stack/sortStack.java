package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class sortStack {
    
    public static void sort(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()) {
            list.add(stack.pop());
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--) {
            stack.push(list.get(i));
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(13);
        stack.push(20);
        stack.push(15);
        stack.push(40);
        stack.push(35);
        sort(stack);
    }
}
