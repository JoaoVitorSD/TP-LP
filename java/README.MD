# TP Linguagnes de Programação - Implementação Java
## Dependências

- Oracle OpenJdk 17 LTS
- Maven (para build)

```sh
# Java
sudo apt install openjdk-17 openjdk-17-jre
# Maven
sudo apt install maven
```

# Build
O projeto foi desenvolvido utilizando o Maven, portanto, para buildar o projeto, basta executar o comando:

```sh
mvn clean install
```


# Descrição do TAD

A classe Set é uma lista de strings. Desta forma, qualquer entrada de dados é permitida, deste que seja em formato de string.
Os métodos são implementados referenciado o próprio objeto, ou seja, não é necessário passar o objeto como parâmetro para os métodos, mas quando
for chamado um método de operação entre 2 conjuntos é necessário passar o conjunto que será operado como parâmetro.
A classe Set reutiliza o método diffConj no _**DiffSimConj**_, pois a união do _DiffConj_ para (A e B)  e (B e A) é o resultado do _DiffSimConj_.
### Exemplo:

```java
Set set = new Set(Arrays.asList("1", "2", "3"));
set = set.intersConj(new Set(Arrays.asList("5", "2", "4")));
System.out.println(set);
// Saída: [2]
```

# Testes

Os testes estão implementados na classe Test, com o método main. Para auxiliar as verificações, foram implementados métodos para comparação
do output exparado com o obtido. Os testes são executados em sequência, e caso algum teste falhe, o programa joga uma _**RuntimeException**_.
Os métodos de comparação podem comparar ints, booleans e listas, que representam os conjuntos. Além destes métodos, há um método para gerar um
Set padrão, com os elementos 1, 2 e 3.
Todos os métodos foram testados individualmente e também em conjunto, para garantir que não haveria problemas de interação entre os métodos.
Como por exemplo o intersConj e ehElementConj. 
Caso todos os testes passem, o programa imprime _**"All tests passed!"**_.