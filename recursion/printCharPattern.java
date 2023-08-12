package recursion;

public class printCharPattern {
    
    public static void printNumber(int n,char c) {
        if(n == 0) {
            return;
        }
        System.out.print(c+" ");
        printNumber(n-1,c);
    }
    
    public static void printPattern(int rows,int currentRow,char[] c) {
        if(rows == currentRow) {
            return;
        }
        printNumber(currentRow,c[currentRow-1]);
        System.out.println();
        printPattern(rows,++currentRow,c);
    }
    
	public static void main(String[] args) {
		int n = 6;
		char[] c = {'A','B','C','D','E','F'};
		printPattern(n,1,c);
	}
}
