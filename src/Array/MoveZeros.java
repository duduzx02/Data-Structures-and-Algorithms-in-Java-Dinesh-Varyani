package Array;

public class MoveZeros {
    public void moveZeros(int[] array, int n) {
        for(int i = 0, j = 0; i < n; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j++] = temp;
            }
        }

        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        int n = array.length;
        MoveZeros movezeros = new MoveZeros();
        movezeros.moveZeros(array, n);


    }
}


