import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPadLeetcode {
    String phoneKeys[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
    public List<String> letterCombinations (String digits){
        if(digits.length() == 0){
            ArrayList<String> blank = new ArrayList<>();
            // blank.add("");
            return blank;
        }
        return letterCombinationsHelper(digits);
    } 
    public List<String> letterCombinationsHelper(String digits){
        // termination case
        if(digits.length() == 0){
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }

        char singleChar = digits.charAt(0); // '2', '3'
        int digit = singleChar - '0';
        String phoneKey = phoneKeys[digit];
        String remNumber = digits.substring(1);
        List<String> result = new ArrayList<>();
        // branching
        for(int i=0; i<phoneKey.length(); i++){
            List<String> temp = letterCombinationsHelper(remNumber);
            // backtrack
            for(String s : temp){
                result.add(phoneKey.charAt(i)+ s);
            }
        }
        return result;
    }
}
