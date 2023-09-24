public class SumOfEvenOddDigits {

    static int[] sumOfEvenOdd(int num){
        // when i create an array
        // array will be created once
        // termination case (runs only once)
        //this is the time to create an array
    
        if(num == 0){
            // [0,0]
            int result[] = new int[2];
            return result; 
        }

        int arr[] = sumOfEvenOdd(num/10); // make the number small
        // when i fill an arrray
        // get the digit
        int digit = num % 10;
        if(digit%2 == 0){
            arr[0] = arr[0] + digit;
        }
        else{
            arr[1] = arr[1] + digit;
        }
        return arr;
    }

    static void sumOfEvenOdd(int num, int evenSum, int oddSum){
        // termination case
        if(num == 0){
            System.out.println("Even Sum "+ evenSum+ " Odd Sum "+ oddSum);
            return;
        }
        // get the digit
        int digit = num % 10;
        if(digit%2 == 0){
            evenSum = evenSum + digit;
        }
        else{
            oddSum = oddSum + digit;
        }
        sumOfEvenOdd(num/10, evenSum, oddSum);
    }

    public static void main(String[] args) {
        int arr[] = sumOfEvenOdd(1234);
        System.out.println("Even Sum "+ arr[0]+ " Odd Sum "+ arr[1]); 
    }
}
