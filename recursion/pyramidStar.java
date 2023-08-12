package recursion;
public class pyramidStar {

    public static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printStar(--n);
    }

    public static void printSpace(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(--n);
    }

    public static void printPattern(int rows,int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace(rows-1);
        printStar(currentRow);
        System.out.println();
        printPattern(--rows, ++currentRow);
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 1);
    }
}
