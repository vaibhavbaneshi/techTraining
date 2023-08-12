package array;

public class rotateArray {

    static int[] arr = {1,2,3,4,5,6,7};
    static int size = arr.length;

    public static void rotateClockwise(int d) {
        
        while(d != 0) {
            for(int i=arr.length-1;i>=0;i--) {
                if(i == 0) {
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            d--;
        }
        
    }

    public static void rotateAntiClockwise(int d) {
        while(d != 0) {
            for(int i=0;i<size;i++) {
                if(i == size-1) {
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            d--;
        }
    }

    public static void print() {
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args) {
        rotateClockwise(2);
        print();
    }
}
