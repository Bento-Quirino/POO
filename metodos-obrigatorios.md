# Métodos Obrigatórios em Java

Este documento aborda os métodos padrão recomendados para qualquer classe Java. Esses métodos garantem uma boa prática de implementação e podem ajudar na legibilidade, na manipulação de dados e no desempenho de uma aplicação.

## 1. `toString()`
O método `toString()` retorna uma representação em `String` do objeto. É útil para imprimir e depurar informações de uma instância da classe.

- **Motivo**: Facilitar a leitura ao mostrar uma descrição mais amigável dos atributos de uma classe.
- **Padrão**: O `toString` padrão exibe o nome da classe e o código de hash do objeto. É comum sobrescrever este método para que ele mostre informações mais detalhadas.

Exemplo:
```java
@Override
public String toString() {
    return "NomeDaClasse{" +
            "atributo1=" + atributo1 +
            ", atributo2=" + atributo2 +
            '}';
}
```

## 2. `equals()`

O método `equals()` permite comparar a instância atual do objeto com outro objeto fornecido para determinar se ambos são "iguais". Este método é fundamental para classes onde a comparação baseada em atributos faz sentido, especialmente ao armazenar objetos em coleções que exigem unicidade ou onde a ordem importa, como em `HashSet`, `ArrayList`, ou como chave em `HashMap`.

### Objetivo
Permitir a comparação de dois objetos para verificar se possuem os mesmos valores em determinados atributos. A implementação padrão em `Object` verifica se as referências de memória dos objetos são as mesmas, mas isso geralmente não é suficiente para comparações significativas entre objetos de uma mesma classe.

### Implementação
Para sobrescrever o método `equals()`, siga estas boas práticas:
1. **Verificar se a referência do objeto é a mesma**: O `this == obj` retorna `true` se ambos os objetos forem o mesmo na memória.
2. **Checar se o objeto passado é `null` ou de uma classe diferente**: Isso evita exceções e garante que a comparação só ocorra entre objetos da mesma classe.
3. **Comparar os atributos relevantes**: Para objetos serem considerados iguais, todos os atributos importantes devem ter valores equivalentes.

Exemplo de implementação:
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;                       // Passo 1: Referência igual
    if (obj == null || getClass() != obj.getClass())    // Passo 2: Verificar classe e nulo
        return false;
    
    NomeDaClasse that = (NomeDaClasse) obj;             // Convertendo para o tipo correto
    return atributo1.equals(that.atributo1) &&          // Passo 3: Comparar os atributos
           atributo2.equals(that.atributo2);
}
```

### Observações
- Consistência com hashCode(): Sempre que equals() é sobrescrito, o método hashCode() também deve ser sobrescrito para garantir que objetos "iguais" tenham o mesmo código hash, essencial para coleções baseadas em hash.
- Evitar instanceof: Prefira getClass() para garantir que o método não seja true para subclasses, o que evita falhas na comparação

### 3. `hashCode()`

O método `hashCode()` retorna um código hash para o objeto, que é um valor numérico utilizado para identificar de maneira rápida a posição de um objeto em estruturas de dados baseadas em hash, como `HashMap` e `HashSet`. Este método deve ser consistente com `equals()`, ou seja, se dois objetos são considerados iguais pelo método `equals()`, eles devem retornar o mesmo código hash.

### Objetivo
O `hashCode()` melhora a eficiência de armazenamento e recuperação de objetos em coleções baseadas em hash. Ele permite localizar rapidamente objetos sem verificar todos os itens da coleção. A implementação correta de `hashCode()` é fundamental para a correta operação dessas coleções.

### Implementação
Ao sobrescrever `hashCode()`, é recomendável usar todos os atributos que determinam a igualdade do objeto (os mesmos que são comparados em `equals()`). Em geral, o método `Objects.hash()` ajuda a simplificar a implementação.

Exemplo de implementação:
```java
@Override
public int hashCode() {
    return Objects.hash(atributo1, atributo2);
}
```

### Princípios Importantes

1. **Consistência com `equals()`**  
   Sempre que `equals()` considera dois objetos como iguais, o método `hashCode()` deve retornar o mesmo valor para esses objetos. Isso é essencial para que coleções baseadas em hash, como `HashSet` e `HashMap`, funcionem corretamente. Se `equals()` retornar `false`, `hashCode()` não precisa necessariamente retornar valores diferentes, embora seja ideal para reduzir colisões.

2. **Imutabilidade**  
   Use atributos imutáveis ao calcular o valor do `hashCode()` sempre que possível. Caso os atributos usados no cálculo do hash code mudem depois que o objeto foi armazenado em uma coleção baseada em hash, o código hash mudará, o que pode comprometer a recuperação do objeto dentro da coleção.

3. **Eficiência e Distribuição Uniforme**  
   O método `hashCode()` deve distribuir objetos de maneira uniforme em coleções para minimizar colisões, onde múltiplos objetos compartilham o mesmo código hash. Colisões frequentes reduzem o desempenho da coleção e afetam a eficiência de busca e inserção.

### 4. `clone()`

O método clone() cria uma cópia do objeto, desde que a classe implemente a interface Cloneable. Sobrescrever este método é opcional, mas recomenda-se lançar uma CloneNotSupportedException se a classe ou algum de seus atributos não puderem ser clonados.

- Motivo: Necessário para criar cópias de objetos.
- Padrão: Sobrescrever o método e definir o tratamento adequado para a clonagem dos atributos.

```java
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}
```

## Exercício: Implementação de uma Classe em Java

Implemente uma classe `Produto` com os seguintes atributos:

- `codigo` (do tipo `int`)
- `nome` (do tipo `String`)
- `preco` (do tipo `double`)
- `categoria` (do tipo `String`)

### Tarefas
1. **Construtor**: Crie um construtor que receba e inicialize todos os atributos da classe.
2. **Getters e Setters**: Implemente os métodos de acesso (`getters`) e modificação (`setters`) para cada um dos atributos (com validação/exceções).
3. **Métodos Obrigatórios**: Implemente os seguintes métodos obrigatórios:
   - `toString()`: Retorna uma `String` representando as informações do produto.
   - `equals(Object obj)`: Compara se dois produtos são iguais, considerando todos os atributos.
   - `hashCode()`: Gera o código hash do objeto com base no código e categoria.
   - `clone()`: Clona um clone do objeto.
