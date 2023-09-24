public class Sort0and1rec {
    
    static void sort(int arr[], int index, int count_0){
        if(index == arr.length-1){
            for(int i=0; i<count_0; i++){
                System.out.println("0");
            }
            for(int i=count_0; i<arr.length; i++){
                System.out.println("1");
            }
            return;
        }

        if(arr[index] == 0){
            count_0++;
        }
        sort(arr, index+1, count_0);
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,0,1,0};
        sort(arr,0,0);
    }
}
