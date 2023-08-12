package recursion;

public class mirrorInvertedHalfPyramid {
    public static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("*"+" ");
        printStar(--n);
    }

    public static void printSpace(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("  ");
        printSpace(--n);
    }

    public static void printPattern(int countRows,int currentRow,int rows) {
        if(countRows == 0) {
            return;
        }
        printSpace(rows-currentRow);
        printStar(currentRow);
        System.out.println();
        printPattern(--countRows,--currentRow, rows);
    }

    public static void main(String[] args) {
        printPattern(5,5,5);
    }
}
