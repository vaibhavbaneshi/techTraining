package recursion;

public class leftPyramid {
    public static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("*"+" ");
        printStar(--n);
    }

    public static void printPattern(int rows,int currentRow) {
        if(rows == 0) {
            return;
        }
        printStar(currentRow);
        System.out.println();
        printPattern(--rows,++currentRow);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
