# Exercício: Diferença entre Classes Abstratas e Interfaces

Neste exercício, vamos explorar a diferença entre classes abstratas e interfaces, e entender como e quando usá-las.

## Instruções

- Formem grupos de até **5 integrantes** para desenvolverem o exercício juntos.
- Cada grupo deverá implementar o código conforme as instruções, testando os métodos `fazerSom()`, `dormir()`, `domesticar()` e `alimentar()` nas classes `Cachorro` e `Gato`.
- A entrega deve ser realizada até **25/10/2024**.

---

### Grupos

| Grupo | Integrantes (máximo 5)                |
|-------|---------------------------------------|
| 1     | Arthur Gaspar, João Pedro, Otávio Lara, Mateus Tavares                                      |
| 2     | Paulo Emanuel, Caio Gonçalves, Vitor Tavares, Murilo Holtz, Ana Julia  |
| 3     | Thaynan, Rafaela, Ryan Édio, Vitor Alves, Mikael Manso     |
| 4     | Gabriel André Cogo, Gabriel Betin, Pedro Melo, Eduardo Marçal, Rafael Luis Banwart                                     |
| 5     | Nicolas Otávio, Pedro Pires, Carlos Augusto                     |
| 6     | Leandro Santos, Danilo Marques, Cauan Almanara, Gian Luca, Caua Cicone     |
| 7     | Eduardo Sierra, Gustavo Ricardo, Brenda Gabriela, Bruno de Almeida Lima, Davi Falciroli                                    |

## Conceitos

- **Classes**: Encapsulam dados e métodos de um objeto. Podem ser instanciadas e podem herdar métodos e propriedades de outras classes.
  
- **Classes Abstratas**: Servem como modelo para outras classes. Não podem ser instanciadas diretamente e podem conter métodos com ou sem implementação. São úteis quando queremos fornecer uma implementação parcial de um comportamento.

- **Interfaces**: Definem um contrato com métodos sem implementação. Todas as classes que implementarem a interface devem fornecer uma implementação para esses métodos. Interfaces são úteis para garantir que classes, mesmo sem parentesco, sigam um padrão comum de métodos.

| Tipo               | Implementação             | Instanciação          | Uso Principal                                      |
|--------------------|---------------------------|------------------------|----------------------------------------------------|
| Classe             | Métodos com lógica completa | Pode ser instanciada  | Representar objetos específicos com comportamento completo |
| Classe Abstrata    | Métodos abstratos e concretos | Não pode ser instanciada diretamente | Fornecer implementação parcial com extensibilidade |
| Interface          | Apenas métodos sem corpo   | Não pode ser instanciada | Definir um contrato comum para classes não relacionadas |

---

## Exercício Prático

1. **Crie uma Classe Abstrata `Animal`** com os seguintes requisitos:
   - Um método abstrato `fazerSom()` que retorna uma `String`.
   - Um método concreto `dormir()` que imprime `"O animal está dormindo..."`.

2. **Crie duas Interfaces**:
   - **Interface `Domesticavel`**: Defina um método `domesticar()`, sem implementação.
   - **Interface `Alimentavel`**: Defina um método `alimentar()` que retorna uma `String`.

3. **Crie duas classes que implementem a Classe Abstrata e as Interfaces**:
   - **Classe `Cachorro`**:
     - Deve estender `Animal` e implementar `Domesticavel` e `Alimentavel`.
     - Implementação de `fazerSom()` deve retornar `"Au au!"`.
     - Implementação de `alimentar()` deve retornar `"Comendo ração"`.
   - **Classe `Gato`**:
     - Deve estender `Animal` e implementar `Domesticavel` e `Alimentavel`.
     - Implementação de `fazerSom()` deve retornar `"Miau"`.
     - Implementação de `alimentar()` deve retornar `"Comendo peixe"`.

### Entrega

- PDF de um manuscrito com a resolução do exercício acima.
- Enviar pelo teams o PDF com a resolução e o nome dos integrantes.
