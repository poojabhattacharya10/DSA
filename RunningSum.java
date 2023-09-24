public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {2,8,6,5,9,4,3};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum is : "+ sum);
    }
}
