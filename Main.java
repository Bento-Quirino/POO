public class Main {    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Tartaruga tartaruga = new Tartaruga();
        TartarugaLeao tartarugaLeao = new TartarugaLeao();

        animal.eat();
        System.out.println(animal.getIdade());

        tartaruga.eat();
        System.out.println(tartaruga.getIdade());

        System.out.println(tartaruga.quantidadeOvos());
        System.out.println(animal);
        System.out.println(tartarugaLeao.quantidadeOvos());
    }
}