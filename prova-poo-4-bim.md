# Prova Prática de Programação Orientada a Objetos em Java

## Objetivo

Implementar um sistema em Java que demonstre o uso de conceitos avançados de Programação Orientada a Objetos (POO), incluindo:

- Multi-herança (com interfaces e classe abstrata)
- Métodos obrigatórios (implementação de métodos de interfaces)
- Sobrecarga de métodos
- Construtor com validação
- Getters e Setters (com validação)

---

## Requisitos

1. **Classe Abstrata `Pessoa`**
   - Crie uma classe abstrata `Pessoa` com os seguintes atributos:
     - `nome` (String): obrigatório, com no mínimo 3 caracteres.
     - `idade` (int): obrigatório, deve ser maior que 0.
   - Implemente métodos `getters` e `setters` para os atributos, com validação:
     - `nome`: deve ter no mínimo 3 caracteres.
     - `idade`: deve ser maior que 0.
   - Implemente um construtor que utilize os setters para validar os valores.

2. **Interfaces `Trabalhador` e `Estudante`**
   - Crie uma interface `Trabalhador` com os métodos obrigatórios:
     - `trabalhar()`: sem retorno, define uma tarefa para a pessoa.
     - `receberSalario()`: retorna um valor double, representando o salário.
   - Crie uma interface `Estudante` com os métodos obrigatórios:
     - `estudar()`: sem retorno, define uma tarefa de estudo.
     - `tirarNota()`: retorna um valor int, representando a nota obtida.

3. **Classe `PessoaTrabalhadoraEstudante`**
   - Implemente a classe `PessoaTrabalhadoraEstudante` que:
     - Extende a classe abstrata `Pessoa`.
     - Implementa as interfaces `Trabalhador` e `Estudante`.
   - Implemente todos os métodos obrigatórios das interfaces, com a lógica necessária para cada caso.
   - Inclua uma sobrecarga do método `tirarNota()` para permitir receber um parâmetro `String` que represente um comentário adicional sobre a nota.

4. **Validação e Testes**
   - Crie uma classe principal `Main` com um método `main` para:
     - Instanciar objetos de `PessoaTrabalhadoraEstudante`, com dados válidos e inválidos, testando as validações.
     - Testar os métodos implementados, garantindo que as sobrecargas e os métodos obrigatórios funcionam corretamente.

---

## Critérios de Avaliação

- **Multi-herança:** Implementação correta da classe abstrata e das interfaces.
- **Métodos obrigatórios:** Implementação de todos os métodos das interfaces e da classe abstrata.
- **Sobrecarga de métodos:** Presença e funcionamento correto da sobrecarga do método `tirarNota`.
- **Validação no Construtor:** Construtor deve validar os atributos usando os setters.
- **Getters e Setters com validação:** Presença de validação nos métodos setters.
- **Testes na Classe Principal:** Comprovação de que todos os métodos funcionam como esperado.

---

Boa sorte e boa prova!

