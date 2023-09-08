import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Enter Range");
        //Scanner sc = new Scanner(System.in);
        int n = new Scanner(System.in).nextInt();
        
        // O(n)
        for(int i = 1 ; i <= n ; i++){

        }

        // O(1) - constant time 
        for(int i = 1 ; i <= 10 ; i++){

        }

        // log(n)
        for(int i = 2 ; i <= n ; ){
            i = (int)Math.pow(i,i);
        }

        // n/2
        for (int i = 1 ; i <= n ; i++, n--){

        }

        // n.log(n)

        // O(n)
        for(int i = 1 ; i <= n ; i++){
            // log(n)
            for(int j = 2 ; j<= n ; j++){
                j = (int)Math.pow(j,j);
            }
        }
    }
}
