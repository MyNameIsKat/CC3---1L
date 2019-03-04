package RPG;
import java.util.Random;

public class Dice {
    
    private Random r = new Random();
    
    public Dice() {
    }

    public int roll() {
        int num = r.nextInt(6)+1;
        return num;
    }
}
