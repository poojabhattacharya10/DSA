public class EvenOddSum {

    static void evenoddSum(int num, int evenSum, int oddSum){
        if(num == 0){
            System.out.println("Even Sum "+ evenSum+ " Odd Sum "+ oddSum);
            return;
        }
        int x = num%10;
        if(x%2 == 0){
            evenSum = evenSum + x;
        }
        else{
            oddSum = oddSum + x;
        }
        evenoddSum(num/10, evenSum, oddSum);
    }

    public static void main(String[] args) {
        evenoddSum(1234, 0, 0);

    }
}
