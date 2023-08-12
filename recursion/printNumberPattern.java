package recursion;

public class printNumberPattern {
    static int count = 0;
    
    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(++count+" ");
        printNumber(n-1);
    }
    
    public static void printPattern(int rows,int currentRow) {
        if(rows == currentRow) {
            return;
        }
        printNumber(currentRow);
        System.out.println();
        printPattern(rows,++currentRow);
    }
    
	public static void main(String[] args) {
		int n = 5;
		printPattern(n,1);
	}
}
