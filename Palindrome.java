public class Palindrome {

    static boolean isPalindrome(int n){
        String str = Integer.toString(n);
        return isPalindrome_Recursion(str, 0, str.length()-1);
    }

    static boolean isPalindrome_Recursion(String str, int start, int last){
        if(start>=last){
            return true;
        }
        if(str.charAt(start) != str.charAt(last)){
            return false;
        }
        return isPalindrome_Recursion(str, start+1, last-1);
    }

    public static void main(String[] args) {
        int n = 13231;
        System.out.println(isPalindrome(n));
    }
}
