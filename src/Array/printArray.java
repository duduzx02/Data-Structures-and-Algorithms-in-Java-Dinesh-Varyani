package Array;

public class printArray {
    // Implementação e demonstração
    public static void printArray(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        printArray(array);
    }
}
