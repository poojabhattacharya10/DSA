/*
 * Recursion:
 * When Function call itself. It creates a Cycle (Loop), we 
 * need to stop this cycle at certain point.
 * to stop the cycle we need put the termination case or base case
 * if u not stop this cycle it will goes infinite and
 * it gives u stackoverflowerror
 */

public class Recursion {

    static void show(int n){
        // Termination case or Base case
        if(n==0){
            return;
        }
        // Recursion Cycle (Loop)
        show(n-1); // Stack Build (STack Push)
        // Stack Pop (this line will run after return);
        System.out.println(n); // processing logic

    }
    public static void main(String[] args) {
        int n = 5;
        show(n);
    }
}
