import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // arr[0] = 20;
        // arr[4] = 60;
        // System.out.println("index 4 element : "+ arr[4]);
        // System.out.println("index 2 element : "+ arr[2]); // 0 by default
        // System.out.println("index 0 element : "+ arr[0]);

        // store 2's tables in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for which you want to print the table of that value : ");
        int value = sc.nextInt();
        System.out.println("Table of "+ value + " is :");
        int table[] = new int[10] ;
        for(int i = 0 ; i<10 ; i++){
            table[i] = value * (i+1);
            // System.out.println(table[i]);
        }

        for(int i : table){
            System.out.println(i);
        }
        sc.close();
    }
}
