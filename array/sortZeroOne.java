package array;

public class sortZeroOne {
    //wihtout sorting algo
    public static int[] sort(int[] arr) {
        int countZero=0,countOne=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                countZero++;
            }

            else {
                countOne++;
            }
        }
        for(int i=0;i<countZero;i++) {
            arr[i] = 0;
        }

        for(int i=countZero;i<countOne+countZero;i++) {
            arr[i] = 1;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,0,1,0,0,1,1,1};
        int[] result = sort(arr);
        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
