package recursion;

public class fullPyramid {

    public static void main(String[] args) {
        int n = 5; // Number of rows

        printRhombusPattern(n);
    }

    public static void printRhombusPattern(int n) {
        printUpperHalf(n, n);
        printLowerHalf(n - 1, n);
    }

    public static void printUpperHalf(int rows, int n) {
        if (rows <= 0) {
            return;
        }

        printSpaces(rows - 1, n);
        printStars(2 * (n - rows) + 1);

        System.out.println();

        printUpperHalf(rows - 1, n);
    }

    public static void printLowerHalf(int rows, int n) {
        if (rows <= 0) {
            return;
        }

        printSpaces(n - rows, n);
        printStars(2 * rows - 1);

        System.out.println();

        printLowerHalf(rows - 1, n);
    }

    public static void printSpaces(int count, int n) {
        if (count <= 0) {
            return;
        }

        System.out.print("  ");

        printSpaces(count - 1, n);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("* ");

        printStars(count - 1);
    }
}
