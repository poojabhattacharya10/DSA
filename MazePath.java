import java.util.ArrayList;

public class MazePath {

    static ArrayList<String> getMazePath(int curRow, int curCol, int endRow, int endCol){
        // reach to 2,2
        if(curRow==endRow && curCol==endCol){
          ArrayList<String> list = new ArrayList<>();
          list.add("");
          return list;  
        }

        ArrayList<String> finalList = new ArrayList<>();

        // Cross 2,2 either horizontally or vertically
        if(curRow>endRow || curCol>endCol){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        
        // Go first Horizontal
        ArrayList<String> horList = getMazePath(curRow, curCol+1, endRow, endCol);
        for (String i : horList) {
            finalList.add('H' + i);
        }

        // Backtrack time go vertical
        // Go first Vertical
        ArrayList<String> verList = getMazePath(curRow+1, curCol, endRow, endCol);
        for (String i : verList) {
            finalList.add('V' + i);
        }

        // Diagonal
        ArrayList<String> digList = getMazePath(curRow+1, curCol+1, endRow, endCol);
        for(String str : digList){
            finalList.add("D" + str);
        }
        
        return finalList; 
   }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePath(0,0,2,2);
        System.out.println(result);
    }

    
}
