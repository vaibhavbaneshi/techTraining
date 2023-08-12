package recursion;

public class crossStar {
    
    public static void printStar(int n) {
        if(n == 0) {
            return;
        }
        System.out.print("* ");
        printStar(--n);
    }

    public static void printPattern(int rows,int numberOfStars) {
        if(rows == 0) {
            return;
        }
        printStar(numberOfStars);
        System.out.println();
        printPattern(--rows,numberOfStars);
    }

    public static void main(String[] args) {
        printPattern(5,1);
    }
}
