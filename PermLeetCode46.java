import java.util.ArrayList;
import java.util.List;


public class PermLeetCode46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> finalResult = new ArrayList<>();
        List<Integer> smallResult = new ArrayList<>();
        helper(nums, finalResult, smallResult);
        return finalResult;
    } 
    // [1,2,3]
    void helper(int[] nums, List<List<Integer>> finalResult, List<Integer> smallResult){
        // termination case
        if(smallResult.size() == nums.length){
            finalResult.add(new ArrayList<>(smallResult));
            return ;
        }

        for(int n: nums){
            if(!smallResult.contains(n)){
                smallResult.add(n);
                helper(nums, finalResult, smallResult);
                smallResult.remove(smallResult.size()-1); // undo (backtrack)
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
