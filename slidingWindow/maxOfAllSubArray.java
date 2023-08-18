package slidingWindow;

import java.util.Arrays;

public class maxOfAllSubArray {
    
    public static int[] maxSubArray(int[] nums,int size) {
        int n = nums.length;
        int[] output = new int[n-size+1];
        Arrays.fill(output,0);
        int max = Integer.MIN_VALUE;
        int i=0,j=0;
        int index = 0;

        while(j < n) {
            if(j-i+1 < size) {
                j++;
            }

            else {
                for(int k=i;k<=j;k++) {
                    max = Math.max(max,nums[k]);
                }
                output[index++] = max;
                i++;
                j++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] output = maxSubArray(nums, 3);

        for(int e : output) {
            System.out.print(e+" ");
        }
    }
}
