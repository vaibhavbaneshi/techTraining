package array;

class pairSum {
    public static int[] solve(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i;j<nums.length-1;j++) {
                int sum = nums[i] + nums[j+1];
                if(sum == target) {
                    int[] num = {i,j+1};
                    return num;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] num = {-1,-2,-3,-4,-5};
        int target = -8;
        int[] arr = solve(num,target);
        for(int e : arr) {
            System.out.print(e+" ");
        }
    }
}