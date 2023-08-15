package slidingWindow;

public class maxSumSubArray {
    
    public static int maxSum(int[] nums,int size) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int i=0,j=0;
        int sum = 0;

        while(j < n) {

            if(j-i+1 < size) {
                j++;
            }

            else if(j-i+1 == size) {
                sum = 0;
                for(int k=i;k<=j;k++) {
                    sum += nums[k];
                }
                i++;
                j++;
            }

            max = Math.max(max,sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = {2,5,1,8,2,9,1};
        System.out.println(maxSum(nums, 3));
    }
}
