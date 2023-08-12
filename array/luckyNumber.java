package array;

import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    
    public static List<Integer> findLuckyNumber(int[][] arr) {
        List<Integer> maxCol = new ArrayList<Integer>();
        List<Integer> minRow = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int minRowE = Integer.MIN_VALUE;
        int maxColE = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                minRowE = Math.min(minRowE,arr[i][j]);
            }
            minRow.add(minRowE);
            minRowE = Integer.MIN_VALUE;
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                maxColE = Math.max(maxColE,arr[j][i]);
            }
            maxCol.add(maxColE);
            minRowE = Integer.MAX_VALUE;
        }

        for(int e : minRow) {
            if(maxCol.contains(e)) {
                result.add(e);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> list = findLuckyNumber(matrix);
        System.out.println(list);
    }
}
