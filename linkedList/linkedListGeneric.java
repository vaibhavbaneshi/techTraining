package linkedList;

class NodeA<T> {
    T data;
    NodeA<T> next;

    public NodeA(T data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedListGeneric {
    public static void main(String[] args) {
        NodeA<Integer> start = new NodeA<>(20);
        start.next = new NodeA<>(30);
        start.next.next = new NodeA<>(40);
        start.next.next = new NodeA<>(50);
    }
}
