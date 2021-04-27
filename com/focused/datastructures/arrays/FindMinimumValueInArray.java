package focused.datastructures.arrays;

public class FindMinimumValueInArray {

    public static int min(int [] arr){
        if(arr.length <1 ) return 0;

        int min_num = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] < min_num) {
                min_num = arr[i];
            }
        }
        return min_num;
    }

    public static void main(String[] args) {
        int arr [] = {1 ,2 ,4, 6, 17, 19, 18, 6, 8};

        System.out.println(min(arr));
    }
}
