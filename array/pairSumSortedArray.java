package array;

import java.util.HashMap;

public class pairSumSortedArray {
    
    public static int findPair(int[] a,int sum) {
        int n = a.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int freq=0;
        int ans=0;
        boolean flag = false;

        for(int i=0;i<n;i++) {
            freq=0;

            int result = sum - a[i];
            if(map.containsKey(result)) {
                ans += map.get(result);
                flag = true;
            }
            else {
                map.put(a[i], freq+1);
            }
        }

        int output = flag ? ans : -1;

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Number of Pairs : ");
        System.out.println(findPair(nums, 8));
    }
}
