package array;

public class barChartPattern {
    
    public static int max(int[] arr,int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
           if(max < arr[i]) {
                max = arr[i];
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,5,6};
        int max = max(arr,arr.length);
        for(int i=max;i>=1;i--) {
            for(int j=0;j<arr.length;j++) {
                if(i <= arr[j]) {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
