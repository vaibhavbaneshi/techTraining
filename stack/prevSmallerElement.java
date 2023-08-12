package stack;

import java.util.Stack;

public class prevSmallerElement {
    
    public static int[] solve(int[] arr) {
        int[] newArray = new int[arr.length];
        if(arr.length == 0) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            newArray[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,15,65,90,85};
        int[] output = solve(arr);

        for(int e : output) {
            System.out.print(e+" ");
        }
    }
}