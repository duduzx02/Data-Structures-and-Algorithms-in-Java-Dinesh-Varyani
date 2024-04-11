package Array;

import java.util.Arrays;

public class RedimensionarArray {
    public static void main(String[] args) {

        // Usando Arrays.copyOf():

        int[] original = {1, 2, 3, 4, 5};
        int[] novoArray = Arrays.copyOf(original, original.length + 2);
        novoArray[novoArray.length - 2] = 6;
        novoArray[novoArray.length - 1] = 7;
        for(int i : novoArray){
            System.out.println(i);
        }

        // Criando um novo array e copiando os elementos
        int[] novoArray2 = new int[original.length + 2];

        for (int i = 0; i < original.length; i++) {
            novoArray2[i] = original[i];
        }
        novoArray2[novoArray2.length - 2] = 6;
        novoArray2[novoArray2.length - 1] = 7;

        for(int i : novoArray2){
            System.out.println(i);
        }
    }
}
