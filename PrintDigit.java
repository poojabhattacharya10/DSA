public class PrintDigit {

    static void printDigit(int n){
        // Termination Case
        if(n==0){
            return;
        }
        // System.out.println(n%10);
        printDigit(n/10);  // Small Problem
        System.out.println(n%10); // processing logic
    }

    public static void main(String[] args) {
        int n = 12345;
        printDigit(n);
    }
}
