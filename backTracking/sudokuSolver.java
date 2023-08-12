package backTracking;

public class sudokuSolver {

    final static int MAX_SIZE = 9;

    static char[][] board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    
    public static boolean solver(int row,int col) {

        if(col == MAX_SIZE) {
            row += 1;
            col = 0;
        }

        if(row == MAX_SIZE) {
            return true;
        }

        if(board[row][col] != '.') {
            return solver(row,col + 1);
        }

        else {
            for(int i=1;i<=MAX_SIZE;i++) {
                char num = (char)(i + '0');
                if(isSafe(row,col,num)) {
                    board[row][col] = num;
                    boolean result = solver(row,col + 1);
                    if(result) {
                        print();
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return true;
    }

    public static boolean isPresentInCol(int col,char value) {
        for(int row=0;row < MAX_SIZE;row++) {
            if(board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPresentInRow(int row,char value) {
        for(int col=0;col < MAX_SIZE;col++) {
            if(board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPresentInGrid(int row,int col,char value) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i=startRow;i < startRow + 3;i++) {
            for(int j=startCol;j < startCol + 3;j++) {
                if(board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int row,int col,char i) {
        return !isPresentInCol(row,i) & !isPresentInRow(col,i) && !isPresentInGrid(row,col,i);
    }

    static void print() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }

    // public static void solverSudoku(char[][] board) {
    //     solver(0,0);
    // }

    public static void main(String[] args) {
        solver(0,0);
    }
}
