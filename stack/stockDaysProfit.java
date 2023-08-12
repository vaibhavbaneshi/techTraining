package stack;

import java.util.Stack;

public class stockDaysProfit {
    
    public static int[] countDaysProfit(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[arr.length];
        int count=1;
        for(int i=0;i<arr.length;i++) {
            count=1;
            for(int j=0;j<i;j++) {
                if(arr[i] > arr[j]) {
                    if(!stack.contains(i))
                        stack.push(i);

                    while(!stack.isEmpty()) {
                        int index = stack.pop();
                        if(arr[index] < arr[i]) {
                            count++;
                        }
                    }  
                }
                else {
                    output[i] = count;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {60,50,40,30,85,90,60};
        int[] result = countDaysProfit(arr);
        
        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
