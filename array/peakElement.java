package array;

public class peakElement {
    
    public static int findPeakIndex(int[] nums) {

        if(nums.length == 1) {
            return 0;
        }

        if(nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }

        for(int i=0;i<nums.length;i++) {

            if(i == nums.length-2) {
                return nums[i] > nums[i+1] ? i : i+1;
            }

            int first = i;
            int mid = i+1;
            int last = i+2;

            if(nums[first] < nums[mid] && nums[mid] > nums[last]) {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(findPeakIndex(nums)); 
    }
}
