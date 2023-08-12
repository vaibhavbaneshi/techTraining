package stack;

public class stackWithArray {
    
    public static class myStack {
        private int[] arr;
        int capacity;
        int top;

        public myStack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        public void push(int x) {
            if(top == capacity-1) {
                System.out.println("The stack is full.");
                return;
            }
            arr[++top] = x;
        }

        public void pop() {
            if(top == -1) {
                System.out.println("The stack is empty.");
                return;
            }
            --top;
        }

        public int peek() {
            if(top == -1) {
                System.out.println("The list is empty.");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public int size() {
            System.out.println("The size of the stack is : ");
            return top+1;
        }

        public void print() {
            if(top == -1) {
                System.out.println("The stack is empty.");
                return;
            }

            for(int i=0;i<=top;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        myStack stack = new myStack(5);
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
