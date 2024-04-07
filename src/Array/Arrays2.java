package Array;

public class Arrays2 {
    public static void main(String[] args) {
        // Criando e inicializando Arrays
        // tipo[] nomeDoArray = new tipo[tamanhoDoArray];

        int[] meuArray = new int[5];

        // Acessando e Modificando Elementos de Arrays
        // nomeDoArray[indice]

        meuArray[0] = 5;
        meuArray[1] = 3;
        meuArray[2] = 8;
        meuArray[3] = 4;
        meuArray[4] = 1;

        // Acessando Elementos de Arrays
        // nomeDoArray[indice]
        System.out.println("meuArray[0] " + meuArray[0]);
        System.out.println("meuArray[1] " + meuArray[1]);
        System.out.println("meuArray[2] " + meuArray[2]);
        System.out.println("meuArray[3] " + meuArray[3]);
        System.out.println("meuArray[4] " + meuArray[4]);

        // obtendo o tamanho de um Array
        // nomeDoArray.length
        System.out.println("meuArray.length " + meuArray.length);

        // Acessando o último elemento de um array
        // nomeDoArray[nomeDoArray.length - 1]
        System.out.println("meuArray[meuArray.length - 1] " + meuArray[meuArray.length - 1]);

        // Criando Arrays diretamente com elementos
        int[] meuArrays2 = {5, 1, 8, 2, 10};

        for (int i = 0; i < meuArrays2.length; i++) {
            System.out.println("meuArrays2[" + i + "] = " + meuArrays2[i]);
        }
    }

}
