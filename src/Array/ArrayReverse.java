package Array;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] novoArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            novoArr[arr.length - 1 - i] = arr[i];
        }

        for(int i: novoArr){
            System.out.println(i);
        }

        System.out.println(arr.equals(novoArr));

    }
}
