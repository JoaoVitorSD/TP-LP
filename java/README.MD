# TP Linguagnes de Programação - Implementação Java

## Descrição do TAD

O construtor da classe Set é privado, para evitar erros de inputs. No caso, o métood estático _readEntry_ 
lê as entradas do usuário e retorna um objeto do tipo Set.
A classe Set, contém uma lista de strings, que representam os elemenetos do conjunto.
Os métodos que foram requeridos são estáticos, pois a classe Set precisa receber o conjunto que vai ser
analisado, desta forma, não faria sentido a classe Set chamar o método e se passar como parâmetro.
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