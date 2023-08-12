package array;

public class maxSumConsecutive {
    
    public static int findMaxSum(int[] arr,int k) {
        int slideSum=0;
        int maxSum=0;

        for(int i=0;i<k;i++) {
            slideSum += arr[i];
        }

        for(int i=k;i<arr.length;i++) {
            slideSum += arr[i] - arr[i-k];

            if(maxSum < slideSum) {
                maxSum = slideSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,40,30,10,20,5};
        System.out.println(findMaxSum(arr, 3));
    }
}
