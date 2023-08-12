package stack;

public class twoStack {
    
    int[] arr;
    int capacity;
    int top1,top2;

    twoStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int data) {
        if(top1 < top2-1) {
            top1++;
            arr[top1] = data;
        }
        else {
            throw new RuntimeException("Stack is full");
        }
    }

    void push2(int data) {
        if(top1 < top2-1) {
            top2--;
            arr[top2] = data;
        }
        else {
            throw new RuntimeException("Stack is full");
        }
    }

    int pop1() {
        if(top1 >= 0) {
            int n = arr[top1];
            top1--;
            return n;
        }
        else {
            throw new RuntimeException("Stack is empty");
        }
    }

    int pop2() {
        if(top2 >= 0) {
            int n = arr[top2];
            top2--;
            return n;
        }
        else {
            throw new RuntimeException("Stack is empty");
        }
    }

    int peek1() {
        if(top1 >= 0) {
            int n = arr[top1];
            return n;
        }
        else {
            throw new RuntimeException("Stack is empty");
        }
    }

    int peek2() {
        if(top2 >= 0) {
            int n = arr[top2];
            return n;
        }
        else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public static void main(String[] args) {
        
    }
}
