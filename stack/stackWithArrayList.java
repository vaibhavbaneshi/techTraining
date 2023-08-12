package stack;

import java.util.ArrayList;

public class stackWithArrayList {
    
    public static class myStack {
        private ArrayList<Integer> stack;

        public myStack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public void pop() {
            if(isEmpty()) {
                throw new IllegalStateException("Stack is empty.");
            }
            stack.remove(stack.size()-1);
        }

        public int size() {
            return stack.size();
        }

        public int peek() {
            if(isEmpty()) {
                throw new IllegalStateException("Stack is empty.");
            }
            return stack.get(stack.size()-1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public void print() {
            if(isEmpty()) {
                throw new IllegalStateException("Stack is empty.");
            }
            System.out.println(stack);
        }
    }

    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.print();

        System.out.println(stack.size());

        stack.pop();
        stack.print();

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}

