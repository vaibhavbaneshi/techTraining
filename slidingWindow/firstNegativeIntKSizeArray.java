package slidingWindow;

import java.util.Arrays;

public class firstNegativeIntKSizeArray {
    
    public static int[] findInt(int[] nums,int size) {
        int n = nums.length;
        int i=0,j=0;
        int output[] = new int[n-size+1];
        Arrays.fill(output,0);
        int index=0;

        while(j < n) {
            if(j-i+1 < size) 
                j++;
            
            else {
                for(int k=i;k<=j;k++) {
                    if(nums[k] < 0) {
                        output[index++] = nums[k];
                        break;
                    }
                }
                i++;
                j++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {12,-1,-7,8,-15,30,16,28};
        int output[] = findInt(nums, 3);

        for(int e : output) {
            System.out.print(e+" ");
        }
    }
}
