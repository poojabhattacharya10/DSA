import java.util.ArrayList;
import java.util.List;

/**
 * GenerateParenthesisLeetCode-22
 */
public class GenerateParenthesisLeetCode22 {
    public List<String> generateParenthesis(int n){
        StringBuilder sb = new StringBuilder();
        List<String> finalResult = new ArrayList<>();
        generateParenthesisHelper(0, 0, n, sb, finalResult);
        return finalResult;
    }  
    
    void generateParenthesisHelper(int opening, int closing, int n, StringBuilder sb, List<String> result){
        // termination case
        if(sb.length() == n*2){
            result.add(sb.toString());
            return; // Stack fall
        }

        if(opening < n){
            sb.append("(");
            generateParenthesisHelper(opening+1, closing, n, sb, result);
            // backtracking
            sb.deleteCharAt(sb.length()-1);
        }

        if(closing < opening){
            sb.append(")");
            generateParenthesisHelper(opening, closing+1, n, sb, result);
            // backtracking
            sb.deleteCharAt(sb.length()-1);
        }
    }
}