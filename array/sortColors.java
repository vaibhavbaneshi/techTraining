package array;

import java.util.HashMap;

public class sortColors {
    
    public static int[] sort(int[] arr) {
        int countZero=0,countOne=0,countTwo=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                map.put(arr[i],countZero += 1);
            }

            else if(arr[i] == 1) {
                map.put(arr[i],countOne += 1);
            }

            else if(arr[i] == 2) {
                map.put(arr[i],countTwo += 1);
            }
        }
        int index=0;
        for(int i : map.keySet()) {
            int count = map.get(i);
            while(count != 0) {
                arr[index] = i;
                index++;
                count--;
            } 
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr =  {0,0,1,2,0,1,0,2,0,2,1,2,1};
        int[] result = sort(arr);
        System.out.println();
        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
