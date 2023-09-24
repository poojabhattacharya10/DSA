public class BinarySearch {

    static int binarySearch(int arr[] , int search , int left , int right){
        if(left>right){
            return -1;
        }

        int mid = (left + right)/2;
        if(search == arr[mid]){
            return mid;
        }
        else if(search < arr[mid]){
            return binarySearch(arr , search , left , mid-1);
        }
        else{
            return binarySearch(arr , search , mid+1 , right);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,7,9,12,45};
        System.out.println("Value found at index : "+ binarySearch(arr , 9 , 0 , arr.length-1));
    }
}
