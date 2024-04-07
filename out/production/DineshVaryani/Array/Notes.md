# Estrutura de Dados Array
## Introdução
- Uma array é uma coleção de elementos de dados do mesmo tipo, armazenados em locais de memória contínuos.Cada 
  elemento da array pode ser acessado por meio de um índice, que é um número inteiro que especifica a posição do 
  elemento na array.   

## Características
- Coleção de dados: Uma array armazena uma coleção de elementos do mesmo tipo.
- Localizações de memória contínuos: Os elementos de uma array são armazenados em locais de memória contínuos, ou 
  seja, um ao lado do outro. 
- Indexação: Cada elemento de uma array possui um índice que especifica sua posição na array.
- Tamanho fixo: O tamanho de uma array é fixo e não pode ser alterado após sua criação.

## Analogia com uma caixa de chocolates
- Imagine uma caixa de chocolates com chocolates separados por divisórias. Cada divisória pode ser vista como um 
  elemento da array. As divisórias são contínuos, ou seja, ficam uma ao lado da outra. Cada divisória possui dois 
  vizinhos, exceto a primeira e a última divisórias. O tamanho da caixa (número de divisórias) é fixo e não pode ser 
  alterado. Cada divisória possui um índice que especifica sua posição na caixa.   

# Declaração e Inicialização de Arrays
## Declaração de Arrays
- Sintaxe para array unidimensional:
- - <tipo_de_dado> <nome_do_array>[]
- Ex: ````int myArray[];````
- Sintaxe preferencial:
- - <tipo_de_dado>[] <nome_do_array>
- Ex: ````int[] myArray;````

## Inicialização de Arrays
- Sintaxe:
- - <nome_do_array> = new <tipo_de_dado>[<tamanho>]
- Ex: ````myArray = new int[5];````
- Tamanho fixo:
- - O tamanho do array é definido na inicialização e não pode ser alterado.
- Declaração e inicialização em uma linha:
- - <tipo_de_dado>[] <nome_do_array> = new <tipo_de_dado>[<tamanho>]
- Ex: ````int[] myArray = new int[5];````
- Inicialização com elementos:
- - <tipo_de_dado>[] <nome_do_array> = {<elemento1>, <elemento2>, ...}
- Ex: ````int[] myArray = {5, 4, 3, 2, 1}````
- O tamanho do array será o número de elementos fornecidos.

# Atualizando ou Adicionando Elementos em Arrays em Java

## Declaração e Inicialização de Arrays
- Declare arrays usando o tipo de variável seguido do tamanho desejado, por exemplo: ````int[] meuArray = new int[5];````
- Os arrays são referências a objetos alocados na memória heap.
- Valores padrão para tipos primitivos são atribuídos ao array na inicialização (0 para inteiros, 0,0 para float, 
  false para booleanos).
## Adicionando Elementos
- Use a notação de colchetes ([]) para acessar índices específicos do array: ````meuArray[0] = 5;````.
- O índice inicial é 0 e o índice final é comprimento -  1.
## Atualizando Elementos
- Acesse o índice desejado e atribua um novo valor: `meuArray[2] = 8`;.
- Atribuições atualizam o valor existente no índice especificado.
## Exceção de Índice Fora dos Limites
* Tentar acessar índices fora do intervalo do array resulta em uma exceção `ArrayIndexOutOfBoundsException`.
* O índice válido é de 0 a `comprimento -  1`.
* Por exemplo, tentar acessar `meuArray[5]` em um array de tamanho 5 gerará uma exceção.

## Conclusão

* Os arrays permitem adicionar e atualizar elementos usando índices.
* Acesse índices usando a notação de colchetes.
* Esteja atento à exceção `ArrayIndexOutOfBoundsException` para evitar erros de acesso a índices inválidos.