public class Animal {
    private int idade = 10;
    
    public void eat() {
        System.out.println("Barulho de comer");
    }

    // Getters
    public int getIdade() {
        return this.idade;
    }

    // Setters 

    /**
     * 
     * @param idade
     * Um número inteiro maior que zero
     * @throws Exception
     * Verifica se idade é maior que 0
     */
    public void setIdade(int idade) throws Exception {
        if (idade > 0) {
            this.idade = idade;
        }

        throw new Exception("Idade deve ser maior que 0");
    }

}
