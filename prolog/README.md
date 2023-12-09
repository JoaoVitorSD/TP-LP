# Implementação Prolog

# TAD

O tad implementado é a lista padrão do prolog.

# Implementação

A implementação não utiliza os predicados pré definidos da linguagem, como member e select.

## Predicados

- ehVazio: verdadeiro se o predicado é uma lista vazia.
- remConj: Se o elemento existe no conjunto, ele é removido da lista. Desta forma, são necessários 3 predicados com 3 parâmetros:
    - Para quando a lista está vazia, então o elemento não é encontrado.
    - Quando o elemento é o Head da Lista, neste caso, ele não está em Z.
    - Quando o elemento é diferente de Head, neste caso, Head está na cabeça de Z.
- uniaoConj: verdadeiro se a união de A e B é o conjunto 
Z. Os elementos são adicionados Head a Head de X e Y, alternado, ao mesmo tempo. Caso o elemento o Head esteja na lista comparada, o Head é removido da lista para um UpdatedY, utilizando o predicado remConj. Este UpdatedY é uma lista de Y que não contem o Head. 
    - Exemplo: uniaoConj([1,2,3],[4,5,6], [1,4,2,5,3,6]).
    - Exemplo: uniaoConj([1,2,3],[3,2,1], [1,3,2])
- intersConj: se a interseção de A e B é o conjunto Z. Neste caso, é utilizada uma lógica similar ao uniaoConj. Em que X e Y são alternados, para ir adicionando elemento a elemento e removêlo da lista, se necessário. A diferença entre o intersConj para o uniaoConj é que o inters precisa verifica se HeadX está em Y, para adicionálo na cabeça de Z.
- diffConj: Retorna se a diferença entre os 2 conjuntos é igual a Z. Se o Head X não estiver em Y, [Head|Z] é verdade no predicado, caso contrário, Z é repassado para diffConj sem o Head como cabeça.
- diffSimConj: Faz a união entre a diferença de A e B e a diferença entre B e A. Logo, diffSimConj é true caso
 - diffConj(A,B, DiffA)
 - diffConj(B,A, DiffB)
 - uniaoConj(DiffA, DiffB, C)
- addConj: adiciona o elemento ao conjunto, porém, foi necessário adicionar um predicado de quando o elemento já está na lista, desta forma,  ele não será duplicado, logo, quando o Head for igual ao elemento X, addConj passa -1 para addConj, para não adicionar X ao fim da lista. Caso o elemento não esteja na lista, ele é adiciona ao final dela, com o predicado addConj([],X,[X]).
- remConj: remove o elemento X de A. se X é igual ao head de A, Z não tem o Head de X como cabeça. Caso contrário, Head de A é o Head de Z.
- tamConj: tamanho de A. Utiliza um predicado numérico para dizer que Tam é o TamLen +1. O Caso base é a lista vazia, em que o TamLen será 0. Desta forma, o tamanho é calculado a patir da última posição.
- ehElemConj: Se o Head da Lista for X, o predicado é verdadeiro, caso contráiro é passado o Tail para ehElemConj até a lista ficar vazia, em que será false, pois X não está na lista vazia.

# Testes

Os testes utilizam predicados para testar cada conjunto, em que são passados os parâmetros iniciais e o que é esperado para ser igual a verdade. Se o predicado for false, é printado qual teste deu erro. Ao final dos testes, o programa printa "Testes Executados!".


# Running

Para rodar os testes ou o código principal:

```sh
prolog -s tp.pl
prolog -s test.pl
```

Com o arquivo teste.sh podendo ser executável no linux,
basta rodar:
```sh
./teste.sh
```

