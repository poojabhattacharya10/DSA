package STRING;

public class RLE {
    public static void main(String[] args) {
        String str = "aaabbcdddeeee";
        System.out.println("Given String : "+ str);
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            int count = 1;
            while((i < n-1) && (str.charAt(i)==str.charAt(i+1))){
                i++;
                count++;
            }
            System.out.print(str.charAt(i) + "" + count);
        }
    }
}
