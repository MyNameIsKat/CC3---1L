package RPG;
import java.util.Random;
/*
This is the dice
according to the instructions
the dice will be made by a 
build in class named random
*/
public class Dice {
    //instance variable
    private Random r = new Random();
    
    public Dice() {
    }

    //a method to randomly generate numbers from 1-6
    //simulates a dice that randomly rolls into numbers 1-6
    public int roll() {
        //added plus one so that numbers dont go to zero 
        //it also makes the numbers go to 6
        int num = r.nextInt(6)+1;
        return num;
    }
}
