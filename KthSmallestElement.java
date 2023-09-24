import java.util.Arrays;

public class KthSmallestElement{

    static int[] findKSmallest(int[] array , int k){
        int[] kSmallest = new int[k];
        for(int i=0 ; i<k ; i++){
            int minIndex = i;
            for(int j=i+1 ; j<array.length ; j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            kSmallest[i] = array[i];
        }
        return kSmallest;
    }

    public static void main(String[] args) {
        int[] array = {12,3,7,4,9,2,8,15}; 
        int k = 3;

        int[] kSmallest = findKSmallest(array,k);
        System.out.println("The "+ k +" smallest elements are : "+ Arrays.toString(kSmallest));
    }
}