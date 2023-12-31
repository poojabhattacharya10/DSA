import java.util.ArrayList;

public class PermString {

    static ArrayList<String> getPerm(String str){
        // Termination Case
        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // Get the First Char
        char firstChar = str.charAt(0);
        // make the string small
        ArrayList<String> result = getPerm(str.substring(1));
        // Create a new ArrayList to store the result
        ArrayList<String> finalList = new ArrayList<>();
        // First traverse an ArrayList
        for(int i=0; i<result.size(); i++){
            // Inside the ArrayList Traverse, traverse the string
            String temp = result.get(i);
            for(int j=0; j<= temp.length(); j++){
                StringBuilder sb = new StringBuilder(temp);
                sb.insert(j, firstChar);
                finalList.add(sb.toString());
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(getPerm("abc"));
    }
}
 