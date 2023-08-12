package heap;

public class deleteFromHeap {
    
    public static int deleteRoot(int[] arr,int n) {
        int i=0;
        int lastElement = arr[n-1];
        arr[0] = lastElement;
        n = n - 1;

        while(i < n) {
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;

            int larger = arr[leftChild] > arr[rightChild] ? leftChild : rightChild;
            if(arr[i] < arr[larger]) {
                int temp = arr[larger];
                arr[larger] = arr[i];
                arr[i] = temp;
                i=larger;
            }
            else    
                break;
        }

        return n;
    }

    public static void printArray(int[] arr,int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 2, 4 };
 
        int n = arr.length;
 
        n = deleteRoot(arr, n);
 
        printArray(arr, n);
    }
}
