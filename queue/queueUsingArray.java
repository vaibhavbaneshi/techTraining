package queue;

class queue {
    int[] arr;
    int size = 0;
    int rear = -1;

    queue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int data) {
        if(rear == size-1) {
            System.out.println("The queue is full.");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("The queue is empty : ");
            return -1;
        }
        int x = arr[0];
        for(int i=0;i<rear;i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        System.out.println("The element removed is : ");
        return x;
    }

    boolean isEmpty() {
        return rear == -1;
    }
}

public class queueUsingArray {
    
}
