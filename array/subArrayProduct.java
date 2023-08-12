package array;

import java.util.ArrayList;

public class subArrayProduct {
    
    public static int checkProduct(int[] arr) {
        int start=0,product=1,k=100,ans=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) {
            product *= arr[i];

            if(product < k) {
                list.add(arr[i]);
            }

            while(product >= k) {
                product = product / arr[start++];
            }
            ans += i - start + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        System.out.println(checkProduct(arr));
    }
}
