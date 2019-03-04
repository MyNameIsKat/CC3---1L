package RPG;

public class Rogue extends Character {

//instance variables    
    private int speed;
    private int maxSpeed;
    
    public Rogue(String n, int s, int d, int i) {
        super(n, s, d, i);   
//added Speed as another element of the rogue to match the magic that the wizard has
        maxSpeed = dice.roll()+10;
        speed = maxSpeed;
    }
//overided the attack method of the parent class named character    
    @Override
    public int attack(){
//rogue attack's has an advantage because they are quicker
//however as the rogue continues to attack the weaker their attacks become because they get tired
//and to avoid an overwhelmingly high attack point i minused three before returning a value
        if(speed>3){
            speed-=3;
            int atk = super.getStrength()+speed;
            return atk;
        }else{
            return super.getStrength()+dice.roll();
        }
        
    }
    
    public boolean dodge(){
//the dice is there so that the rogue can only dodge sometimes  
//and will have greater chance of dogding with higher dexterity
        return super.getDexterity()>dice.roll();
    }
/*
    due to the private access modifier of the Speed and MaxSpeed variables,
    a accessor (get methods) are made so that other classes may get these variables
    
    */   
    
//gets the speed    
    public int getSpeed(){
        return speed;
    }
//gets the max speed    
    public int getMaxSpeed(){
        return maxSpeed;
    }

}
