package array;

public class additionArray {
    
    public static int[] add(int[] arr1,int[] arr2) {
        int carry=0,sum=0;
        int n = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] result = new int[n+1];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;

        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = arr1[i] + arr2[j] + carry;
            }

            else if(i >= 0 && j < 0) {
                sum = arr1[i] + carry;
            }

            else if(i < 0 && j >=0) {
                sum = arr2[j] + carry;
            }

            result[k] = sum%10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }

        if(carry != 0) {
            result[0] = carry;
        }
        

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9,1,8,9,2};
        int[] arr2 = {9,1,2,7};

        int[] result = add(arr1,arr2);
        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
