# Implementação Python


# TAD

O tad implementação utiliza a lista padrão do python, com todas as funções definidas no arquivo Set.

# Implementação

Todas as operações são implementadas utilizando as funções do python, com a palavra:
> def


# Métodos

## ehVazio

Utiliza o bool do python para verificar se a lista está vazia ou não.

## uniaoConj

Se o elemento de B não estiver em A, ele é adicionado a união.

## intersConj

Inicializa uma lista vazia, para cada elemento de B se ele está em A, ele é adicionado a lista.

## diffConj

Inicializa uma lista vazia, para cada elemento de A se ele não está em B, ele é adicionado a lista.

## diffSimConj

Pega a diffConj de A e B e a diffConj de B e A, e faz a união das duas. Na prática, é a diffSim implementada em partes.

## addConj

Se o elemento já não estiver na lista, ele é adicionado.

## remConj

Se o elemento estiver na lista, ele é removido.

## tamConj

Utiliza a função len do python para retornar o tamanho da lista.

## ehElemConj

Se o elemento estiver na lista, retorna True, se não, retorna False.


# Running

Para rodar, basta ter o python instalado e rodar o arquivo main.py com o comando:
```sh
python main.py
```
Para rodar os testes, basta rodar o arquivo test.py com o comando:
```sh
python test.py
```

# Testes

Os testes estão implementados em uma única função com todos os testes, se todos passarem, 
o programa imprime "All tests passed", se algum falhar, imprime "Some test failed". Além disso, os testes que falharam são impressos na tela.


O arquivo teste.sh é um script que roda o arquivo test.py e imprime o resultado na tela.
Para rodar, é necessário ter o Ptython3 instalado e rodar o comando:
```sh
./teste.sh
```