package Array;

import java.util.Arrays;

public class FindSecondMaximum {
    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    public static int encontrarSegundoMaxComSort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,10,11,12,13,14,9,20};
        System.out.println(findSecondMaximum(arr));

        System.out.println(encontrarSegundoMaxComSort(arr));
    }
}
