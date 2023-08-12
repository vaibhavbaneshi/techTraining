package backTracking;

public class NQueen {
    
    public static int countWays(boolean[][] board,int currentRow) {
        int count=0;
        if(currentRow == board.length) {
            printBoard(board);
            System.out.println("Indexes where Queen is placed : ");
            printIndexes(board);
            System.out.println();
            return 1;
        }

        for(int col=0;col<board.length;col++) {
            if(isSafe(board,currentRow,col)) {
                //place Queen
                board[currentRow][col] = true;
                //move to next row
                count += countWays(board, currentRow+1);
                //backtracking
                board[currentRow][col] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board,int row,int col) {
        //check vertically upwards
        for(int i=row;i>=0;i--) {
            if(board[i][col]) {
                return false;
            }
        }

        //check upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
            if(board[i][j]) {
                return false;
            }
        }

        //check upper right diagonal
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++) {
            if(board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(boolean[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                if(!board[i][j]) {
                    System.out.print("- ");
                }
                else {
                    System.out.print("Q ");
                }
            }
            System.out.println();
        }
        return;
    }

    public static void printIndexes(boolean[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                if(board[i][j]) {
                    System.out.print("Row :- "+i+" Column :- "+j);
                }
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        int count = countWays(new boolean[4][4], 0);
        System.out.println("Number of ways to solve NQueen Problem : ");
        System.out.println(count);
    }
}
