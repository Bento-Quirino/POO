public class Main {    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Tartaruga tartaruga = new Tartaruga();
        Transformers transformers = new Transformers();
        TartarugaLeao tartarugaLeao = new TartarugaLeao();

        animal.eat();
        System.out.println(animal.getIdade());

        tartaruga.eat();
        System.out.println(tartaruga.getIdade());

        System.out.println(tartaruga.quantidadeOvos());
        System.out.println(animal);
        System.out.println(tartarugaLeao.quantidadeOvos());

        System.out.println("TRANSFORMERS");

        transformers.ligar();
        transformers.dominarOMundo();
        transformers.fazerCafe();
        transformers.eat();
        try {
            transformers.setIdade(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(transformers.getIdade());

    }
}