package heap;

public class heapSort {

    public static void heapify(int[] arr,int n,int i) {
        int larger = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        if(leftChild < n && arr[leftChild] > arr[larger]) {
            larger = leftChild;
        }

        if(rightChild < n && arr[rightChild] > arr[larger]) {
            larger = rightChild;
        }

        if(larger != i) {
            int temp = arr[i];
            arr[i] = arr[larger];
            arr[larger] = temp;
            heapify(arr, n, larger);
        }
    }

    public static void buildHeap(int[] arr,int n) {
        for(int i=n/2;i>=0;i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapSortFunc(int[] arr,int n,int index) {

        buildHeap(arr, n);

        for(int i=n-1;i>=0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp; 
            heapify(arr, i, 0);
        }

    }

    public static void print(int[] arr) {
        for(int e : arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {40,10,30,50,60,15};
        System.out.println("Before heap creation : ");
        print(arr);
        buildHeap(arr, arr.length); 
        System.out.println("After heap creation : ");  
        print(arr);
        System.out.println("After heapSort : ");
        heapSortFunc(arr, arr.length,arr.length-1);
        print(arr);
    }
}
