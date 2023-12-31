package recursion;

public class searchElement {
    
    public static int[] searchIndex(int[] arr,int index,int element,int count) {
        if(index == (arr.length-1)) {
            int a[] = new int[count];
            return a;
        }

        int[] arr_2 = null;
        if(arr[index] == element) {
            arr_2 = searchIndex(arr, index+1, element, count+1);
        }
        else {
            arr_2 = searchIndex(arr, index+1, element, count);
        }
        if(arr[index] == element) {
            arr_2[count] = index;
        }

        return arr_2;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,8,3,3,7};
        int element = 3;
        int output[] = searchIndex(arr,0,element,0);
        for(int i=0;i<output.length;i++) {
            System.out.print(output[i]+" ");
        }
    }
}
