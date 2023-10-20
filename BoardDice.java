import java.util.ArrayList;

class BoardDice{
    static ArrayList<String> reachToTen(int start, int end){
        
        if(start == end){
            // reach to 10, stop here
            // create a blank arraylist
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        if(start>end){
            // this case crosses the end
            ArrayList<String> list = new ArrayList<>();
            return list;
            // not part of result , stop it
        }

        // to store result
        ArrayList<String> finalList = new ArrayList<>();

        for(int dice=1; dice<=6; dice++){
            int newValue = start + dice;
            ArrayList<String> result = reachToTen(newValue, end);
            // this loop only runs when it reach to 10
            for(String str: result){
                finalList.add(dice + str);
            }
        }
        return finalList;
    }
    public static void main(String[] args) {
        ArrayList<String> result = reachToTen(0, 10);
        System.out.println(result);
    }
}