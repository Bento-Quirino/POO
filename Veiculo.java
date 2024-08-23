package POO;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        //setMarca(marca);
        //setModelo(modelo);
        //setAno(ano);
    }

    // Esse método não foi implementado pois todo veículo tem um custo de manutenção diferente
    public abstract double calcularCustoManutencao(); // Método abstrato

    // Métodos com sobrecarga
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
    public void mostrarInfo(boolean ano) {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        if (ano) {
            System.out.println("Ano: " + this.ano);
        }
    }

    // mostrarInfo() -> Mostra a marca e o modelo
    // mostrarInfo(true) -> Mostra a marca, o modelo e o ano
    // Métodos com sobrecarga são métodos com o mesmo nome, mas com parâmetros diferentes
    // A sobrecarga é feita com base nos parâmetros
}
