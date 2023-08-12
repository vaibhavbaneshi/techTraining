package array;

public class smallerThanCurrent {
    
    public static int[] findSmall(int[] arr) {
        int[] newArray = new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++) {
            count=0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
            newArray[i] = count;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] result = findSmall(arr);

        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
