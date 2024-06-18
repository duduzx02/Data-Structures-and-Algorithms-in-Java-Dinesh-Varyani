package Array;

public class MissingNumber {
    public static int findMissingNumber(int[] array){
        int n = array.length;
        int totalSum = (n +1) * (n +2) /2; // Soma dos primeiros n+1 e n+2 números naturais

        int arraySum = 0;
        for(int num : array){
            arraySum += num;
        }

        return totalSum - arraySum; // o número ausente é o resultado da diferença entre a soma total e a soma dos elementos de um array

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8};
        System.out.println("O número faltante é" + findMissingNumber(array));
    }
}
