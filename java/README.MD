# TP Linguagnes de Programação - Implementação Java

## Dependências

- Oracle OpenJdk 17 LTS

```sh
# Java
sudo apt install openjdk-17 openjdk-17-jre
```
## Descrição do TAD

A classe Set é uma lista de strings. Desta forma, qualquer entrada de dados é permitida, deste que seja em formato de string.
Os métodos são implementados referenciado o próprio objeto, ou seja, não é necessário passar o objeto como parâmetro para os métodos, mas quando
for chamado um método de operação entre 2 conjuntos é necessário passar o conjunto que será operado como parâmetro.

Exemplo:
```java
Set set = new Set(Arrays.asList("1", "2", "3"));
set = set.intersConj(new Set(Arrays.asList("5", "2", "4")));
System.out.println(set);
// Saída: [2]
```
```
Exemplo:

```java
// Solução evitada:
public static void main(){
    Set set1 = Set.readSetEntry();
    Set set2 = Set.readSetEntry();
    set1.uniaoConj(set1, set2);
}

// Solução adotada:
public static void main(){
    Set set1 = Set.readSetEntry();
    Set set2 = Set.readSetEntry();
    Set.uniaoConj(set1, set2);
}
```