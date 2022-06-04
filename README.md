# Chain of responsibility
Padrão de projeto GOF.

  - Reduz a quantidade de operadores lógicos (if's, switches);
  - Organiza as lógicas de resolução do problema (cria uma subclasse para cada possível resolução);
  - Deve ser usado quando há realmente muitos operadores lógicos aninhados. Pois o COR aumenta a complexidade do código;
  - Facilita as futuras expansões do código, por exemplo, quando surgir uma nova possível resolução do problema;

No caso de uso desse código é informada uma série histórica de preços, e é exigido que se calcule algumas métricas (fictícias) dessa série histórica;
a forma mais simples inicialmente seria aninhar if's no arquivo `calcMetricService`. Entretaneto, conforme adicionarmos novas métricas,
a complexidade do `calcMetricService` aumentará na mesma proporção, por isso a opção por utilizar o COR.
