package recursion;

public class hollowSquareStar {
    
    public static void printStar(int countRows,int currentRow,int rows) {
        if(countRows == 0) {
            return;
        }
        if(currentRow == 1 || currentRow == rows) {
            System.out.print("*"+" ");
        }
        else {
            if(countRows == 1 || countRows == rows) {
                System.out.print("*"+" ");
            }
            else {
                System.out.print("-"+" ");
            }
        }
        printStar(--countRows,currentRow,rows);
    }

    public static void printPattern(int countRows,int numberOfStars,int currentRow,int rows) {
        if(countRows == 0) {
            return;
        }
        printStar(numberOfStars,currentRow,rows);
        System.out.println();
        printPattern(--countRows,numberOfStars,++currentRow,rows);
    }

    public static void main(String[] args) {
        printPattern(5,5,1,5);
    }
}
