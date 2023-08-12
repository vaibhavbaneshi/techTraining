package queue;

class circularQueue {
    int size = 0;
    int rear,front = -1;
    int[] arr;

    circularQueue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int data) {
        if((rear+1)%size == front) {
            System.out.println("The queue is full : ");
            return;
        }
        if(front == -1) {
            front++;
        }
        rear = (rear + 1)%size;
        arr[rear] = data;
    }

    public int remove() {
        if(rear == -1) {
            System.out.println("The queue is empty : ");
            return -1;
        }
        int x = arr[front];
        if(front == rear) {
            front = rear = -1;
        }
        else {
            front = (front+1)%size;
        }
        return x;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("The queue is empty : ");
            return -1;
        }
        int peek = arr[rear];
        System.out.println("The peek element is : ");
        return peek;
    }

    boolean isEmpty() {
        return rear == -1;
    }
}

public class circularQueueUsingArray {
    
}
