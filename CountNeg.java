import java.util.Scanner;

public class CountNeg {
    public static void main(String[] args) {
        // int arr[] = {-3,-4,9,-8,4};
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i<arr.length-1 ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Negative nums");

        for(int i : arr){
            if(i<0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Negative number : "+ count);
        sc.close();
    }
}
