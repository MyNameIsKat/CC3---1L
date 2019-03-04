package RPG;

public class Wizard extends Character {
//instance variables
    private int currentMagic;
    private int maxMagic;
    
    public Wizard(String n, int s, int d, int i) {
        //super keyword is used 
        super(n, s, d, i);          
        maxMagic=dice.roll()+10; //sets the maximum magic power
        currentMagic=maxMagic;   //the editable amount of the magic power
    }
    
/**   
* castLightningBolt() represents casting a magic spell. The   
* method first checks that currentmagic is greater than/equal  
* to 5. If it is, currentmagic is reduced by 5 and a random   
* number is returned using the dice inherited from Character,   
* modified by the character's intelligence.   
* Otherwise, returns 0.   
*/  
    public int castLightningBolt(){
        if(currentMagic>=5){
            currentMagic-=5;        
            return dice.roll()+super.getIntelligence();
        }else{
            return 0;            
        }
    }
/**  
* castHeal() represents casting a magic spell. The method first  
* checks that currentmagic is greater than/equal to 8. If it   
* is, currentmagic is reduced by 8 and the character's heal()   
* method is called with a random number, modified by the  
* character's intelligence score. The amount healed is also  
* returned by the method.  
*/

    public int castHeal(){
        if(currentMagic>=8){
            currentMagic-=8;
            return dice.roll()+super.getIntelligence();
        }else{
            return 0;            
        }
    }
/*
    due to the private access modifier of the CurrentMagic and MaxMagic variables,
    an accessor (get methods) are made so that other classes may get these variables
    
    */    
//gets max Magic    
    public int getMaxMagic(){
        return maxMagic;
    }
//gets the current Magic    
    public int getCurrentMagic(){
        return currentMagic;
    }
    
    
}
