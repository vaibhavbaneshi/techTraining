package array;

import java.util.*;
import java.util.Map.*;

public class majorityNumber {
    
    public static int findMajority(int[] arr) {
        int count=0,majorityNumber=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            count=0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i] == arr[j])
                    map.put(arr[i],++count);
            }
        }
        count=0;
        for(Entry<Integer, Integer> entry : map.entrySet()) {
            if(count < entry.getValue()) {
                count = entry.getValue();
                majorityNumber = entry.getKey();
            }
        }
    //    System.out.println(map.get(4));
    //    System.out.println(map);

        return majorityNumber;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(findMajority(arr));
    }
}
