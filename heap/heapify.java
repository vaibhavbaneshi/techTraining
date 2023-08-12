package heap;

public class heapify {
    
    public static void heapifySort(int[] arr,int n,int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[largest] < arr[left]) {
            largest = left;
        }

        if(right < n && arr[largest] < arr[right]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapifySort(arr, n, largest);
        }
    }

    public static void buildHeap(int[] arr,int n) {
        for(int i=n-1;i>=0;i--) {
            heapifySort(arr, n, i);
        }
    }

    public static void printArray(int[] arr,int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 40;
        arr[1] = 10;
        arr[2] = 30;
        arr[3] = 50;
        arr[4] = 60;
        arr[5] = 15;

        int n = 6;
        printArray(arr, n);
        buildHeap(arr, n);
        printArray(arr, n);
    }
}
