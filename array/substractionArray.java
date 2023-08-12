package array;

public class substractionArray {
    
    public static int[] sub(int[] arr1,int[] arr2) {
        int borrow=0,sub=0;
        int n = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] result = new int[n+1];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;

        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                if(arr1[i] >= arr2[j]) {
                    sub = (arr1[i] - borrow)  - arr2[j];
                    borrow = 0;
                }

                else {
                    sub = (arr1[i] + 10) - arr2[j];
                    borrow = 1;
                }
            }

            else if(i >= 0 && j < 0) {
                sub = arr1[i] - borrow;
            }

            else if(i < 0 && j >=0) {
                sub = arr2[j] - borrow;
            }

            result[k] = sub%10;
            i--;
            j--;
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9,8,7,5};
        int[] arr2 = {1,2,3,8}; 
        int[] result = sub(arr1,arr2);

        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
