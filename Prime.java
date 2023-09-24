public class Prime {
    static void isPrime(int n , int i){
    // Termination Case
        
        if(i == n){
            System.out.println("No. is prime"+ n);
            return;
        }
        if(n % i == 0){
            System.out.println("Not Prime");
            return;
        }
        isPrime(n, i++);
        
    }
    public static void main(String[] args) {
        int i = 2 ;
        int n = 7 ;
        isPrime(n , i);
    }
}
