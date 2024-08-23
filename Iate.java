package POO;

public class Iate extends Veiculo {
    private int qtdMaxTripulantes; // Atributo extra da Classe

    public Iate(String marca, String modelo, int ano, int qtdMaxTripulantes) { // Construtor da Classe
        super(marca, modelo, ano); // CHama o construtor da super classe
        this.qtdMaxTripulantes = qtdMaxTripulantes; //setQtdMaxTripulantes(qtdMaxTripulantes);
    }   

    @Override
    public double calcularCustoManutencao() { // método abstrato da super classe que foi sobreescrito
        return 500*this.qtdMaxTripulantes; 
    }
}
