package queue;

import java.util.LinkedList;
import java.util.Queue;

public class binaryDigit {
    static Queue<String> q = new LinkedList<>();
    
    public static void printBinary(int n) {
        if(n == 0) {
            return;
        }
        q.offer("1");
        for(int i=0;i<n;i++) {
            String currentChar = q.poll();
            System.out.print(currentChar+" "); 
            String element1 = currentChar + "0";
            String element2 = currentChar + "1";

            q.offer(element1);
            q.offer(element2);
        }
    }

    public static void main(String[] args) {
        printBinary(7);
    }
}
