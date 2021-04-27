package focused.datastructures.arrays;

public class RemoveEvenFromArrays {

    public static int [] removeEvenNumsfromArray(int [] arr){
        int counter = 0;
        // find out the length of the array after removing even nums
        for(int i =0; i < arr.length; i++){
            if(arr[i]%2!=0) counter++;
        }

        int result [] = new int [counter];
        counter =0 ;

        for(int i =0; i < arr.length; i++){
            if(arr[i]%2!=0) {
                result[counter] = arr[i] ;
                counter++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr [] = {1 ,2 ,4, 6, 17, 19, 18, 6, 8};

        int arr_result [] =  removeEvenNumsfromArray(arr);

        for(int i : arr_result) {
            System.out.println( i );
        }
    }
}
