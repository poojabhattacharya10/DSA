public class MazePathDemo {
    static void printMazePath(int curRow , int curCol , int endRow , int endCol , String result){
        if(curRow==endRow && curCol==endCol){
            System.out.println(result);
            return;            
        }
        if(curRow>endRow || curCol>endCol){
            return;
        }
        // 2 branches

        // go one step hor
        printMazePath(curRow, curCol+1, endRow, endCol, result+"H");
        // go one step ver
        printMazePath(curRow+1, curCol, endRow, endCol, result+"V");
    }
    public static void main(String[] args) {
        printMazePath(0,0,2,2,"");
    }
}
