package Array;

public class MoveZros {
    public static void moveZeros(int[] array) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[index] = array[i];
            if (array[i] != 0) {
                index++;
            }
        }

        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveZeros(array);
        System.out.println("Array após mover zeros para o final: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
