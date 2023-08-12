package recursion;

public class diagonalLinePattern {
    public static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("*");
        printStar(--n);
    }

    public static void printSpace(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("-");
        printSpace(--n);
    }

    public static void printPattern(int countRows,int currentRow,int rows) {
        if(countRows == 0) {
            return;
        }
        printSpace(countRows-1);
        printStar(currentRow);
        printSpace(rows-countRows);
        System.out.println();
        printPattern(--countRows,currentRow,rows);
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 1,n);
    }
}
