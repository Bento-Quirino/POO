package POO; // Nome do pacote(POO) é o mesmo nome da pasta

// Classe principal
public class Main {
    // Se tentar instanciar o Veiuclo, vai dar erro, pois é uma classe abstrata
    // Veiculo veiculoQualquer = new Veiculo("Yamaha", "Yate 1", 2020);

    // Método principal onde o programa começa a ser executado
    Iate iateQualquer = new Iate( // Tipo da variável é Iate, nome da variável é iateQualquer
        "Yamaha", 
        "Yate 1", 
        2020, 
        10
    );

}
