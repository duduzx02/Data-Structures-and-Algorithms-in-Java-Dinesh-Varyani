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