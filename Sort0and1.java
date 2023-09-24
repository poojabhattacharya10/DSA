public class Sort0and1 {

    static void sort(int arr[]){
        int count0 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }
        }

        for(int i=0; i<count0; i++){
            arr[i] = 0;
            System.out.println("0");
        }

        for(int i=count0; i<arr.length; i++){
            arr[i] = 1;
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,0,1,0};
        sort(arr);
    }
}
