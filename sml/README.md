# Implementação SML

Esta implementação representa os conjuntos como lista de inteiros em suas operações.

# Instalação
```sh
sudo apt install smlnj
```

# Estrutura de dados

A estrutura de dados utilizada é uma lista de inteiros. Dessa forma, os elementos do add e remove também são ints.


# Algoritmo implementado

**As funcionalidades possuem o pseudo código similar ao sml, visando representar a lógica da implementação de forma simples.**

- **addElement**: Recebe uma lista de ints e concatena com o elemento já inserido em uma lista auxiliar

    - >set@[element]  
- **ehVazio** verifica se o conjunto é nulo com o operador **null**
    - null set
- **uniaoConj**: concatena as duas listas com o operador @
    - > a@b
- **isPresent**: Itera pelos elementos da lista de forma recursiva, se o elemento está presente, é retornado true, caso contrário uma nova chamada é feita passando o tl do conjunto até que a lista passada esteja vazia, em que é retornado false
    - > hd a = element or else isPresent(tl a, element)

- **diffConj**: Itera pelos elementos de A e e caso ele esteja presente em B, o elemento não é retornado. Os retornos são concatenados em uma nova lista, que contém todos os elementos de a que não estão em b.
    - > if not isPresent(a,hd b) then a @ diffConj(tl a, b) else diffConj(tl a, b)

- **diffSimConj**: concatena 2 chamadas de diffConj, ou seja, todos elementos de b que não estam em a concatenados de todos elementos de a que não estam em b
    - > diffConj(a,b)@diffConj(b,a)

- **addConj**: concatena o elemento adicionado a uma lista à lista
    - > a@[element]

- **remConj**: chama diffConj passando o elemento que será removido dentro de uma lista
    - > diffConj(a, [element])

- **tamConj**: itera pela lista somando um a cada iteração, até a lista ser vazia, em que 0 é retornado
    - > if null a then 0 else 1+tamConj(tl a)
- **ehElemenConj**: itera pela lista, verificando se a hd da lista é igual ao elemento, caso contrário, outra iteração é chamada passando o tl da lista, até a lista passada ser vazia

- **intersConj**- verifica se elemento de b está presente em a, se sim,é retornado o elemento concatenado de outra chamada, passando o tl de b
    - > if isPresent(a, hd b) then [hd b]@intersConj(, tl b) else intersConj(a, tl b)

# Testes

Os testes rodam ifs que printam se o teste deu erro e caso contrário retornam (),

# Running

Com o sml instalado, basta rodar o arquivo main.sml ou o test.sml(para testar).
```sh
sml main.sml
sml test.sml
```

Os testes são rodados automaticamete ao executar o arquivo teste.sh