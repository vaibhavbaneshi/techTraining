package recursion;

public class mazePath2 {
    
    public static void print(int currentRow,int currentCol,int endRow,int endCol,String output) {
        if(currentRow == endRow && currentCol == endCol) {
            System.out.print(output+",");
            return;

        }

        if(currentCol > endCol || currentRow > endRow) {
            return;
        }
        print(currentRow+1,currentCol,endRow,endCol,output+"V");
        print(currentRow,currentCol+1,endRow,endCol,output+"H");
        print(currentRow+1,currentCol+1,endRow,endCol,output+"D");
    }

    public static void main(String[] args) {
        print(0,0,2,2,"");
    }
}
