package Array;

public class MoveZeroToEndOfAnArray {
    public void moveZeros(int[] array, int n) {
        int j = 0;
        for(int i = 0; i < n; i++ ){
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {

    }
}

