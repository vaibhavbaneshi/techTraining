package recursion;

import java.util.*;

public class mazePath {
    
    public static ArrayList<String> getMaze(int currentRow,int currentCol,int endRow,int endCol) {

        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        if(currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> horizontalResult = getMaze(currentRow+1,currentCol,endRow,endCol);
        for(String s : horizontalResult) {
            result.add("H"+ s);
        }

        ArrayList<String> verticalResult = getMaze(currentRow,currentCol+1,endRow,endCol);
        for(String s : verticalResult) {
            result.add("V"+ s);
        }

        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> output = getMaze(0,0,2,2);
        System.out.print(output);
        System.out.println();
        System.out.print(output.size());
    }
}
