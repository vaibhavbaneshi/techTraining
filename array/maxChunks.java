package array;

public class maxChunks {
    
    public static int chunkCount(int[] arr) {
        int chunkCount=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
                chunkCount++;
            }
        }

        return chunkCount;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        System.out.println(chunkCount(arr));
    }
}
