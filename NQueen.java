public class NQueen {
    static int getNumberOfPossibilty(boolean board[][], int currentRow){
        int count = 0;
        // termination case
        if(currentRow==board.length){
            return 1;
        }
        // traverse each cell of a current row
        for(int col=0; col<board[currentRow].length; col++){
            // place a queen on a current cell, but check before
            if(isSafeToPlaceAQueen(board, currentRow, col)){
                board[currentRow][col] = true;  // place a queen
                int result = getNumberOfPossibilty(board, currentRow+1);
                count = count + result;
                // Backtracking
                board[currentRow][col]=false;  // undo a queen
            }
        }

        return count;
    }
    private static boolean isSafeToPlaceAQueen(boolean[][] board, int currentRow, int col) {
        // check on above row
        for(int i=currentRow; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        // check left upper diagonal
        for(int i=currentRow,j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        // check right upper diagonal
        for(int i=currentRow,j=col; i>=0 && j<board.length; i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        final int N = 9;
        boolean board[][] = new boolean[N][N] ;
        System.out.println("Queen Place" + getNumberOfPossibilty(board, 0));
    }
}
