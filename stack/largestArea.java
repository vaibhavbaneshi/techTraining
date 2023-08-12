package stack;

import java.util.Stack;

public class largestArea {
    
    public static int findLargestArea(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] prevSmall = prevSmall(arr);
        int[] nextSmall = nextSmall(arr);
        int prevSmallValue=0,nextSmallValue=0;
        for(int i=0;i<arr.length;i++) {
            sum=0;
            prevSmallValue = (i-prevSmall[i]-1)*arr[i];
            nextSmallValue = (nextSmall[i]-i-1)*arr[i];
            sum += arr[i] + prevSmallValue + nextSmallValue;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static int[] prevSmall(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] newArray = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            newArray[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return newArray;
    }

    public static int[] nextSmall(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] newArray = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            newArray[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,5,6,3,4,5};
        System.out.println("Largest area : "+findLargestArea(arr));
    }
}
