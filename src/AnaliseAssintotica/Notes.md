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

