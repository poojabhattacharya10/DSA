public class Longest1sString {
    static int getLongestLengthOfSubString(String str) {
        int left = 0;
        int maxLength = 0;
        int countZeroes = 0;
        for(int right = 0 ; right < str.length() ; right++){
            if(str.charAt(right) == '0'){
                countZeroes++;
            }
            while(countZeroes>1){
                if(str.charAt(left) == '0'){
                    countZeroes--;
                }
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(getLongestLengthOfSubString("11001101"));
    }
}
