package array;

public class isArraySorted {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        boolean isSorted = true;
        for(int i=0;i<arr.length;i++) {
            if(i == arr.length-1) {
                break;
            }
            if(arr[i] >= arr[i+1]) {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
