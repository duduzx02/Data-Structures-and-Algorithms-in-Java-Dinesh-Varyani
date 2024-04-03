# Análise assintótica
## O que é Análise assintótica?
- Asymptotic analysis ajuda a avaliar o desempenho de um algoritmo em termos de tamanho de entrada e seu aumento.
- Quando fazemos essa análise assintótica, na verdade não medimos o tempo real de execução de um algoritmo.
- Está análise simplesmente nos ajuda a determinar como o tempo e o espaço ocupados pelo algoritmo aumentam com o 
  tamanho da entrada.

## Ententendo a complexidade
- Se o tamanho da entrada de um algoritmo for pequeno, menos tempo e espaço serão necessários para processar essa 
  entrada.

# Asymptotic Notations | Omega, Theta and Big O Notations
- As notações assintóticas são as ferramentas matemáticas usadas para descrever o tempo de execução de um algoritmo 
  em termos de seu tamanho de entrada.
- Existem três notações para realizar a análise do tempo de execução de um algoritmo.
- - Omega(Ω) Notation
- - - Esta Notação expressa basicamente o limite inferior do tempo de execução do algoritmo.
- - - Fornece informações sobre o tempo mínimo necessário para o algoritmo.
- - - Essa notação nos dá uma ideia dos recursos mínimos necessários para executar o algoritmo.
- - Big O (Ο) Notation
- - - Esta notação expressa o limite superior do tempo de execução do algoritmo.
- - - Esta notação determina o maior tempo que o algoritmo pode levar para ser concluido.
- - Theta (Θ) Notation
- - - Esta notação expressa basicamente os limites superior e inferior do tempo de execução de um algoritmo.
- - - Para qualquer tamanho de entrada de um algoritmo, isso determina a quantidade média de tempo.

# Análise da Complexidade Temporal em Notação Big O
## Noções Básicas
- - A notação Big O fornece um limite superior para o tempo de execução de um algoritmo.
- - Os cálculos são feitos supondo que o algoritmo é executado em uma máquina monoprocessada, sequencialmente.

## Regras para Estimar o Tempo de Execução
- Operações de Atribuição: Assume-se que consomem uma unidade de tempo.
- Instrução de Retorno: Considerada uma unidade de tempo.
- Operações Aritméticas: Consomem uma unidade de tempo (ex: +, - , /, *).
- Operações Lógicas: Também consomem uma unidade de tempo (ex: E, OU, negação).
- Outras Operações Simples: Geralmente estimadas em uma unidade de tempo.

## Calculando a Complexidade em Big O
- Assume-se uma entrada de tamanho muito grande (n).
- Equações polinomiais são simplificadas descartando termos de ordem inferior (ex: 3n, 1).
- Multiplicadores constantes também são descartados (ex: 3n² - > n², 6n - > n).
- O resultado é expresso na forma O(f(n)).

## Aplicação das Regras
- Exemplo 1: Tempo de execução = n² + 3n + 1 - > O(n²)
- Exemplo 2: Tempo de execução = 3n² + 6n + 1 - > O(n²)

# Complexidade de Tempo de Algoritmos Constantes
## Entendendo as Regras da Notação Big O
- Em nosso vídeo anterior, abordamos as regras relacionadas à notação Big O. Vamos aplicar essas regras e calcular a 
  complexidade de tempo de um algoritmo constante.  

### Código de Algoritmo Constante
````Java
    int sum(int x, int y) {
        return x + y;
    }
````

## Análise da Complexidade de Tempo
- Linha 2:
- - Acessando x e y: 2 operações
- - Somando x e y: 1 operação
- - Atribuindo o resultado a result: 1 operação
- - Total: 4 operações (4 unidades de tempo)
- Linha 3:
- - Acessando result: 1 operação
- - Retornando result: 1 operação
- - Total: 2 operações (2 unidades de tempo)

## Tempo Total
- Tempo total = 4 (Linha 2) + 2 (Linha 3) = 6 unidades de tempo

## Definição de Algoritmo Constante
- O tempo gasto por este algoritmo permanece constante, independentemente dos valores de entrada (x e y). Portanto, 
  é considerado um algoritmo constante. 

## Código de Acesso a Array
````Java

    int getArrayValue(int[] arr, int index){
        return arr[index];
    }
````
- Linha 2:
- - Acessando o valor do array no índice especificado: 1 operação
- - Retornando o valor: 1 operação
- - Total: 2 operações (2 unidades de tempo)

## Complexidade de Tempo Constante
- O tempo gasto para acessar um valor de array em um índice específico é constante, independentemente do tamanho do 
  array. Portanto, este é também um algoritmo constante.   

## Notação Big O para Algoritmos Constantes
- A complexidade de tempo de algoritmos constantes é denotada como O(1) porque o tempo executado é constante, não 
  variando com o volume de dados.  

### Resumo:
- Algoritmos constantes têm tempo de execução que não dependem do volume de dados.
- A complexidade de tempo de algoritmos constantes é representada como O(1).
- A notação Big O considera constantes como O(1).

# Como Calcular a complexidade de tempo de um algoritmo linear
## Visão Geral
- Este artigo explica como calcular a complexidade de tempo de um algoritmo linear, que é um algoritmo cuja 
  complexidade de tempo é diretamente proporcional ao tamanho da entrada. 

## Algoritmo de Exemplo
- Como exemplo, vamos considerar o algoritmo que calcula a soma dos primeiros n números naturais:

````
public void findSum(int n){
    int sum = 0;
    for(int i =1; i <= n; n++){
        sum =+ i;
        }
        return sum;
}
````
## Cálculo da Complexidade de Tempo
- A complexidade de tempo é calculada contando o número de operações executadas pelo algoritmo em função do tamanho 
  da entrada (n) e multiplicando o número de operações pelo tempo unitário de cada operação.
- |---|---|---| 
- | 2 | Criação da variável sum               
- | 3 | Criação da variável i, acesso a n, comparação 
- | 4 | Soma, atribuição 
- | 5 | 
- | 6 | Acesso a i, acesso a sum, comparação | 3 | 
- | 7 | Incremento de i, atribuição | 3 | 
- | 8 | Acesso a sum, retorno | 2 |

-| Linha | Operações | Tempo Unitário |
-| 2  |  1  | 1  |
-| 3  |  1+3n+3+3n | 6n+4  |
-| 4  |  n(1+1+1+1)  | 4n  |
-| 6  |  1 + 1  |  2 |


## Para o Loop for:
- Número de Iterações: n + 1
- Operações por Iteração: 3
- Tempo Total: (n + 1) x 3 = 3n + 3

## Para i++:
- Número de Iterações: n
- Operações por Iteração: 3
- Tempo Total: n x 3 = 3n

## Para Linha 4 (Loop for):
- Número de Iterações: n
- Operações por Iteração: 4
- Tempo Total: n x 4 = 4n

## Tempo Total:
- Somando os tempos de cada linha, temos:
- - Tempo Total = 1 + (3n + 3) + 4n + 2 = 10n + 6

## Complexidade de Tempo Assimptótica
- Na notação de Big O, ignoramos termos de ordem inferior e constantes, resultando na complexidade de tempo assimptótica:

````markdown
O(n)
````

## Conclusão
- O algoritmo considerado é um algoritmo linear, pois sua complexidade de tempo é diretamente proporcional ao 
  tamanho da entrada (n). Isso significa que à medida que o tamanho da entrada aumenta, o tempo de execução do 
  algoritmo também aumenta proporcionalmente.  