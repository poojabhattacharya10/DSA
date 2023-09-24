public class DivisibleBy11 {

    static boolean isDivisible(int arr[]){
        int sum_odd = 0;
        int sum_even = 0;
        
        for(int i=0 ; i<arr.length; i++){
            if(i%2==0){
                sum_even += arr[i];
            }
            if(i%2!=0){
                sum_odd += arr[i];
            }
        }
        int diff = sum_even - sum_odd;
        int mod = diff%11;
        if(mod==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {6,6,2,2,1,1,0};
        boolean ans = isDivisible(arr);
        System.out.println(ans); 
    }
}
