import java.util.Random;

public class Tartaruga extends Animal {
    
    public int quantidadeOvos() {
        return new Random().nextInt(41);
    }

    public void eat() {
        System.out.println("NHAM NHAM");
    }
}
