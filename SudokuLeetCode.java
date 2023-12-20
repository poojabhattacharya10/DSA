public class SudokuLeetCode {
    char[][] board;
    boolean isPresentInRow(int row, char value){
        for(int col = 0; col < MAX_DIGIT; col++){
            if(board[row][col] == value){
                return true;
            }
        }
        return false;
    }

    boolean isPresentInCol(int col, char value){
        for(int i = 0; i < MAX_DIGIT; i++){
            if(board[i][col] == value){
                return true;
            }
        }
        return false;
    }

    boolean isPresentInGrid(int row, int col, char value){
        int startRow = row - row%3;
        int startCol = col - col%3;
        for(int i = startRow; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if(board[i][j] == value){
                    return true;
                }
            }
        }
        return false;
    }

    boolean canIPlace(int row, int col, char digit){
        // check unique in row
        // check unique in col
        // check unique in subgrid
        return !isPresentInRow(row, digit) && !isPresentInCol(col, digit) && !isPresentInGrid(row, col, digit);
    }

    public void solveSudoku(char[][] board){
        this.board = board;
        solveSudokuHelper(0, 0);
    }

    int MAX_DIGIT = 9;
    boolean solveSudokuHelper(int row, int col){
        if(col == MAX_DIGIT){
            row = row + 1;
            col = 0;
        }

        if(row == MAX_DIGIT){
            return true;
        }

        if(board[row][col] != '.'){
            return solveSudokuHelper(row, col+1);
        }

        for(int digit = 1; digit <= MAX_DIGIT; digit++){
            char currentDigit = (char)(digit + '0');
            if(canIPlace(row, col, currentDigit)){
                board[row][col] = currentDigit; // Place value on cell
                // move to next cell
                boolean result = solveSudokuHelper(row, col+1);
                // backtracking
                if(result){
                    // solve sudoku
                    return true;
                } 
                board[row][col] = '.';
            }
        }
        return false;
    }
}
