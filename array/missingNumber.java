package array;

public class missingNumber {
    
    public static int find(int[] arr) {
        boolean isPresent = false;
        int count=0;
        for(int i=0;i<arr.length;i++) {
            count++;
        }

        for(int i=0;i<=count;i++) {
            isPresent = false;
            for(int j=0;j<arr.length;j++) {
                if(i == arr[j]) {
                    isPresent = true;
                }
            }
            if(!isPresent) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        int n = find(arr);
        System.out.println(n);
    }
}
