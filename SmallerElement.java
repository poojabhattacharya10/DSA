import java.util.Scanner;

public class SmallerElement {
    public static void main(String[] args) {
        System.out.println("Enter size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest num : "+ min);
        sc.close();
    }
}
