package Array;

public class ComoRedimensionarUmArray {
    public static int[] redimensionarMatriz(int[] matriz, int novaCapacidade){
        // Criação de uma matriz temporária com a nova capacidade
        int[] matrizTemporaria = new int[novaCapacidade];

        // Cópia dos elementos da matriz original para a matriz temporária
        for(int i = 0; i< matriz.length; i++){
            matrizTemporaria[i] = matriz[i];
        }

        // Retorna a matriz redimensionada
        return matrizTemporaria;
    }

    public static void main(String[] args) {

        int[] minhaMatriz = {1, 2, 3, 4, 5};

        // Redimensionar a matriz para uma capacidade do dobro
        int[] matrizRedimensionada = redimensionarMatriz(minhaMatriz, minhaMatriz.length * 2);

        // Imprimir os elementos da matriz redimensionada
        for (int i = 0; i < matrizRedimensionada.length; i++) {
            System.out.println(matrizRedimensionada[i]);
        }
    }

}
