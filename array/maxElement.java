package array;

public class maxElement {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
           if(max < arr[i]) {
                max = arr[i];
           }
        }
        System.out.println("The greatest element is  : "+max);
    }
}
