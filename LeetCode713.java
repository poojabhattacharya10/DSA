public class LeetCode713 {
    static int numSubarrayProductLessThanK(int[] nums , int k){
        int left = 0;
        int countSubArray = 0;
        int product = 1;
        if(k <= 1){
            return 0 ;
        }
        for(int right = 0; right < nums.length ; right++){
            product = product * nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
            countSubArray += right - left + 1;
        }
        return countSubArray;
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,3};
        // int k = 0;
        // o/p = 0
        int[] nums = {10,5,2,6};
        int k = 100;
        // o/p = 8
        System.out.println(numSubarrayProductLessThanK(nums , k));
    }
}
