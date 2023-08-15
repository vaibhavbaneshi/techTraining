package array;

public class findMinimumSortedRotated {
    
    public static int findMinimun(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid = 0;

        while (start <= end) {
            if (nums[start] <= nums[end]) {
                return nums[start];
            }

            mid = (start + end) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return nums[mid];
            }

            if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        System.out.println("Number of Rotation : "+mid);
        return nums[mid];
    }

    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        System.out.println(nums);
    }
}
