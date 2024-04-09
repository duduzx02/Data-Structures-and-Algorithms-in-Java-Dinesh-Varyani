package Array;

public class FindMinimum {
    public static int findMinimum(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {5,6,4,39,8,5,1,2,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(findMinimum(arr));
    }
}
