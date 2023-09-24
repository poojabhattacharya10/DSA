public class ArrayConversion{

    static int[] toArray(int n){
        int new_Array[] = new int[digitCount(n)];
        for(int i = new_Array.length-1 ; i>0 ; i--){
            int a = n%10;
            new_Array[i] = a;
            n = n/10;
        }
        return new_Array;
    }
     static int digitCount(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++ ;
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 65471;
        int ans[] = toArray(n);
        for(int i:ans){
            System.out.println(i + " ");  
        }
    }
}