package RPG;
/**
 * The Character class models a character for a roleplaying game.
 * A character has a name and 3 stats: strength, dexterity, and
 * intelligence, as
 * well as maximum allowed life points and the current value.
 */
public class Character {
    /** static variables */
    private static Dice dice = new Dice();
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int currentLife;
    private int maxLife;
    /** instance variables */
    /**
     * Constructor takes 4 parameters: n,s,d,i and assigns them to
     * instance variables name, strength, dexterity, intelligence.
     * Also uses the dice instance to assign a random
     * number to maxlife. currentlife is initialized to maxlife
     * @param n,s,d,i
     */
    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence=i;
//added ten so they won't die so easily        
        maxLife=dice.roll()+10;
        currentLife=maxLife;
        
    }
    /**
     * Returns a random die roll using the roll method in the
     * Dice.java, *modified by the character's strength
     * @return 
     */
    public int attack() {
        return dice.roll()+strength;
    }
    
    /**
     * Decreases currentlife by the damage parameter
     * @param damage
     */
    public void wound(int damage) {
        System.out.println(name+" is damaged "+damage);
        currentLife-=damage;
        System.out.println(name + "'s life: "+currentLife+"/"+maxLife);
    }
    /**
     * Increases currentlife by the heal parameter.
     * currentlife cannot be greater than maxlife
     * @param heal
     */
    public void heal(int heal) {
        System.out.println(name+" uses heal");
    //this won't add more health to if the currentLife is already equal to maxLife
        if(currentLife==maxLife){
            System.out.println(name + "'s life: "+currentLife+"/"+maxLife);
        }else{
            currentLife+=heal;
        //this will limit the currentLife from exceeding the maxLife
            if(currentLife>maxLife){
                currentLife=maxLife;
            }else{    }
        //prints        
            System.out.println(name + "'s life: "+currentLife+"/"+maxLife);
        }
        
    }
    /**
     * Returns name
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Returns strength
     * @return 
     */
    public int getStrength() {
        return strength;
    }
    /**
     * Returns dexterity
     * @return 
     */
    public int getDexterity() {
        return dexterity;
    }
    /**
     * Returns intelligence
     * @return 
     */
    public int getIntelligence() {
        return intelligence;
    }
    /**
     * Returns currentlife
     * @return 
     */
    public int getCurrentLife() {
        return currentLife;
    }
    /**
     * Returns maxlife
     * @return 
     */
    public int getMaxLife() {
        return maxLife;
    }
}
