public class LinearRecursion {

    static void show(int n){
        // TERMINATION CASE
        if(n == 0){
            return;
        }
        System.out.println(n); // Processing Logic
        // small problem (n-1) + Recursion (Cycle)
        show(n-1);  // Tail Recusrion
        System.out.println(n);  // Processing Logic
    }


    public static void main(String[] args) {
        int n = 5;
        show(n);
    }
}
