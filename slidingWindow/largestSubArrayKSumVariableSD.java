package slidingWindow;

public class largestSubArrayKSumVariableSD {
    
    public static int findLargestSubArray(int[] nums,int sum) {
        int n = nums.length;
        int i=0,j=0;
        int calcSum = 0;
        int subArraySize = 0;
        calcSum = nums[0];
        
        while (j < n) {
            if (calcSum < sum) {
                j++;
                if (j < n) {
                    calcSum += nums[j]; 
                }
                subArraySize = Math.max(subArraySize, j - i + 1);   
            }
            else {
                calcSum -= nums[i]; 
                i++;
            }
        }

        return subArraySize;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,1,1,2,3,5};
        System.out.println(findLargestSubArray(nums, 5));
    }
}
