package array;

public class productWithoutItself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int output[] = new int[n];
        output[0] = nums[0];

        for(int i=1;i<n;i++) {
            output[i] = output[i-1] * nums[i];
        }

        for(int i=n-1;i>=1;i--) {
            output[i] = output[i-1] * product;
            product *= nums[i];
        }
        output[0] = product;

        return output;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};

        int[] output = productExceptSelf(input);

        for(int e : output) {
            System.out.print(e+" ");
        }
    }
}
