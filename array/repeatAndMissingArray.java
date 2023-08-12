package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class repeatAndMissingArray {
    //the missing number is difference between expectedSum and actualSum
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        int a=-1,b=-1;
        long n = A.size();

        Collections.sort(A);
        for(int i=0;i<n-1;i++) {
            if(A.get(i).equals(A.get(i+1))) {
                a = A.get(i);
                break;
            }
        }
        int actualSum = 0;
        long expectedSum = (long)(n*(n+1))/2;
        for(int i=0;i<n;i++) {
            if(i+1 < n && A.get(i).equals(A.get(i+1))) {
                continue;
            }
            else
                actualSum += A.get(i);
        }
        b = (int)(expectedSum - actualSum);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        ArrayList<Integer> result = repeatedNumber(list);
        System.out.println(result);
    }
}