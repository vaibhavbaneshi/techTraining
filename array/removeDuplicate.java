package array;

public class removeDuplicate {
    
    public static int remove(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            int n = arr[i];
            for(int j=i;j<arr.length;j++) {
                if(j == arr.length-1) {
                    break;
                }
                if(n == arr[j]) {
                    arr[j] = arr[j+1];
                    count++;
                }
            }
        }
        for(int e : arr) {
            System.out.print(e+" ");
        }
        return arr.length-count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int n = remove(arr);
        System.out.println(n);
    }
}
