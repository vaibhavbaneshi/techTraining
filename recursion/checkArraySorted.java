package recursion;

public class checkArraySorted {
    
    public static boolean check(int[] arr,int index) {
        if(index == arr.length-1) {
            return true;
        }

        if(arr[index] < arr[index+1]) {
            check(arr, index+1);
        }
        else {
            return false;
        }
        return check(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        boolean result = check(arr,0);

        if(result)
            System.out.println(result);
        
        else    
            System.out.println(result);    
    }
}
