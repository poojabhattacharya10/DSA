import java.util.Arrays;

public class MissingNumber {

    static int approach1(int arr[] , int k){
        Arrays.sort(arr);
        if(arr[arr.length-1]!=k){
            return k;
        }
        for(int i=0; i<arr.length ; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int arr[] = {2,1,4,5};
       int ans = approach1(arr,5);
       System.out.println(ans);        
    }
}
 