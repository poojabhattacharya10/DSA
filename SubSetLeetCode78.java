import java.util.ArrayList;
import java.util.List;

public class SubSetLeetCode78 {
    public List<List<Integer>> subsets(int[] nums){
        int index = 0;
        List<List<Integer>> finalResult = new ArrayList<>();
        List<Integer> smallResult = new ArrayList<>();
        helper(nums, finalResult, smallResult, index);
        return finalResult;
    }

    void helper(int[] nums, List<List<Integer>> finalResult, List<Integer> smallResult, int currentIndex){
        // Termination Case
        if(currentIndex > nums.length){
            return;
        }
        finalResult.add(new ArrayList<>(smallResult));
        for(int j = currentIndex; j < nums.length; j++){
            smallResult.add(nums[j]);
            helper(nums, finalResult, smallResult, j+1);
            // backtrack
            smallResult.remove(smallResult.size()-1);
        }
    }
}
