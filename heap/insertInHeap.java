package heap;

public class insertInHeap {

    public static int insertNode(int[] arr, int n, int key) {
        n = n + 1;
        int i=n-1;
        arr[i] = key;
        while(i >= 0) {
            int parent = (i-1)/2;
            if(arr[parent] < arr[i]) {
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
                i=parent;
            }
            else  
                break;
        }
        return n;
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
        int n = 5;
        int key = 15;
        printArray(arr, n);
        int m = insertNode(arr, n, key);
        printArray(arr, m);
    }
}
