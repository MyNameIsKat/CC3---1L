package RPG;

import java.io.*;

public class CharacterDuel {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //for getting user input
        Dice d = new Dice(); //to be able to use the dice class
        
        System.out.println("*************************"
                + "\n***** LET'S DUEL!!! *****"
                + "\n*************************");
        
        int cho = 0;
//variables to hold the needed variables for the parameters
        String name="john";
        int strength=0;
        int dexterity=0;
        int intelligence=0;
        
/* this will hold the class type (whether wizard or rogue)
 * that the player chooses and it will determine
 * which the battle type that will commence (wizard vs wizard,
 * rogue vs rogue, wizard vs rogue, rogue vs wizard)
 * variable clas will hold player1's choice the clas2 will hold the other      
 */        
        int clas=0;
        int clas2=0;
        
/*when a rogue chooses to dodge, this variable will become true
 * and it won't run the opponent's attack moves 
 * and will be set to false again afterwards until the 
 * rogue chooses to dodge again*/
        boolean atkWillBeDodged=false;

//to create a spacing in which the user uses enter to continue        
        System.out.println("[PRESS ENTER]");
        br.readLine();
        
        System.out.println("----- Player[1]Status -----");
//this let the user choose a class        
        System.out.println("****** Choose a Class *****"
                + "\n[1]Wizard"
                + "\n[2]Rogue");        
        clas=Integer.parseInt(br.readLine());
        
//to write the username
        System.out.print("Enter Name: ");
        name = br.readLine();
/*
  the stats are randomly generated using the dice 
  because user made stats has more tendency to be unfair
  so they're randomly genrated and here the user may choose 
  the combination of randomly generated stats
*/
        System.out.println("Your stats will be randomly generated"
                + "\n[PRESS ENTER]");
        //user typed space
        br.readLine();
        
/*  the loop for generating random stats
    loops until the user is satisfied which they 
    press any other number other from 0 to exit
*/        
        while(cho==0){
            strength = d.roll();
            dexterity = d.roll();
            intelligence = d.roll();
            System.out.println("Strength: "+strength);
            System.out.println("Dexterity: "+dexterity);
            System.out.println("Intelligence: "+intelligence);
            System.out.println("\nPRESS [0] TO ROLL AGAIN"
                    + "\nPRESS ANY OTHER NUMBER OTHERWISE");
            cho = Integer.parseInt(br.readLine());
        }
        
//to make cho (user choice) 0 again so that the while loop for the player two can go again
        cho = 0;
        
/*
        two objects instantiated from the two classes named with 
        the number one to indicate that it is player 1 
        this is so that the battle type can proceed whatever the user choose as a class
*/
        Wizard w1 = new Wizard(name, strength, dexterity, intelligence);
        Rogue r1 = new Rogue(name, strength, dexterity, intelligence);
        System.out.println("PLAYER 1 has successfully created their account\n"); //indicates that the player has succesfully made a character
        
        //player2's turn
        //same goes for player 2
        System.out.println("----- Player[2]Status -----");
        System.out.println("****** Choose a Class *****"
                + "\n[1]Wizard"
                + "\n[2]Rogue");
        clas2=Integer.parseInt(br.readLine());
        
        System.out.print("Enter Name: ");
        name = br.readLine();
        System.out.println("Your stats will be randomly generated"
                + "\n[PRESS ENTER]");
        br.readLine();
        
        while(cho==0){
            strength = d.roll();
            dexterity = d.roll();
            intelligence = d.roll();
            System.out.println("Strength: "+strength);
            System.out.println("Dexterity: "+dexterity);
            System.out.println("Intelligence: "+intelligence);
            System.out.println("\nPRESS [0] TO ROLL AGAIN"
                    + "\nPRESS ANY OTHER NUMBER OTHERWISE");
            cho = Integer.parseInt(br.readLine());
        }
        Wizard w2 = new Wizard(name, strength, dexterity, intelligence);
        Rogue r2 = new Rogue(name, strength, dexterity, intelligence);
        
        System.out.println("PLAYER 2 has successfully created their account\n");

//variable to hold how many rounds the loop run 
//or in other words how many rounds the players has fought        
        int round =0;

    /*  
        so here is where it gets kind of brute force, as said previously the clas and clas2 
        will set the battle type and there are 4 battle types; wizard vs wizard, rogue vs rogue, wizard vs rogue, rogue vs wizard.
        (battle type here refers to the possible combination of battles that can take place)
        so basically the battle method is instatiated 4 times (i can't really make a method for the battle because of the object instantiation and its parameters)
        and those battles are similar but are slightly different from each other 
        due to the presence of different types of objects that are classes that are different
        
        */        
        if(clas==1 && clas2==1){
            //prints both of their stats
            System.out.println("------ Player [1] ------");
            System.out.println("Name: "+w1.getName());
            System.out.println("Health: "+w1.getCurrentLife()+"/"+w1.getMaxLife());
            System.out.println("Strength: "+w1.getStrength());
            System.out.println("Dexterity: "+w1.getDexterity());
            System.out.println("Intelligence: "+w1.getIntelligence());
            System.out.println("Magic: "+w1.getCurrentMagic()+"/"+w1.getMaxMagic());
            System.out.println("");
            System.out.println("------ Player [2] ------");
            System.out.println("Name: "+w2.getName());
            System.out.println("Health: "+w2.getCurrentLife()+"/"+w2.getMaxLife());
            System.out.println("Strength: "+w2.getStrength());
            System.out.println("Dexterity: "+w2.getDexterity());
            System.out.println("Intelligence: "+w2.getIntelligence());
            System.out.println("Magic: "+w2.getCurrentMagic()+"/"+w2.getMaxMagic());
            System.out.println("");
            
            //start of battle
            System.out.println("=== BATTLE START! ===");
            System.out.println("");
            
            //variable to hold the number of times the game was in play
            round = 0;
            
            //while loop until the someone dies
            while(w1.getCurrentLife()>0 || w2.getCurrentLife()>0){
                System.out.println("*************");
                System.out.println("ROUND "+round);//indicates what round it is
                System.out.println("*************");
                System.out.println(w1.getName()+" : "+w1.getCurrentLife()+"/"+w1.getMaxLife()); //shows life points of player 1
                System.out.println("Magic: "+w1.getCurrentMagic()+"/"+w1.getMaxMagic());//shows Magic points of player 1
                System.out.println(w2.getName()+" : "+w2.getCurrentLife()+"/"+w2.getMaxLife()); //shows life points of player 2
                System.out.println("Magic: "+w2.getCurrentMagic()+"/"+w2.getMaxMagic());//shows Magic points of player 1
                System.out.println("");
                
                System.out.println("*** PLAYER 1's TURN ***"); //indicates player1's turn
                
                wizardMenu(); //shows wizard menu
                
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1: //this attack will cause a would to player 2
                        w2.wound(w1.attack());
                        break;
                    case 2: //this will heal randomly
                        w1.heal(d.roll());
                        break;
                    case 3: //this attack will cause a would to player 2
                        w2.wound(w1.castLightningBolt());
                        break;
                    case 4: //this will heal with a cast
                        w1.heal(w1.castHeal());
                        break;    
                }
                
                if(w1.getCurrentLife()<=0 || w2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                
                //same goes for any other wizard
                System.out.println("");
                System.out.println("*** PLAYER 2's TURN ***");
                wizardMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        w1.wound(w2.attack());
                        break;
                    case 2:
                        w2.heal(d.roll());
                        break;
                    case 3:
                        w1.wound(w2.castLightningBolt());
                        break;
                    case 4:
                        w2.heal(w2.castHeal());
                        break;    
                }
                if(w1.getCurrentLife()<=0 || w2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                //increases the round count
                round++;
            }
            System.out.println("");
            //indicate the battle ended
            System.out.println("=== BATTLE END! ===");
            
            //to show the results
            if(w1.getCurrentLife()==w2.getCurrentLife()){
                System.out.println("It's a draw!");
            }else if(w1.getCurrentLife()>w2.getCurrentLife()){
                System.out.println(w1.getName()+" WINS!!!");
            }else if(w2.getCurrentLife()>w1.getCurrentLife()){
                System.out.println(w2.getName()+" WINS!!!");
            }else{
                System.out.println("It's a draw!");
            }
        }else if(clas==2 && clas2==2){
            //prints both of their stats
            System.out.println("------ Player [1] ------");
            System.out.println("Name: "+r1.getName());
            System.out.println("Health: "+r1.getCurrentLife()+"/"+r1.getMaxLife());
            System.out.println("Strength: "+r1.getStrength());
            System.out.println("Dexterity: "+r1.getDexterity());
            System.out.println("Intelligence: "+r1.getIntelligence());
            System.out.println("Magic: "+r1.getSpeed()+"/"+r1.getMaxSpeed());
            System.out.println("");
            System.out.println("------ Player [2] ------");
            System.out.println("Name: "+r2.getName());
            System.out.println("Health: "+r2.getCurrentLife()+"/"+r2.getMaxLife());
            System.out.println("Strength: "+r2.getStrength());
            System.out.println("Dexterity: "+r2.getDexterity());
            System.out.println("Intelligence: "+r2.getIntelligence());
            System.out.println("Magic: "+r2.getSpeed()+"/"+r2.getMaxSpeed());
            System.out.println("");
            
            //start of battle
            System.out.println("=== BATTLE START! ===");
            System.out.println("");
            
            //variable to hold the number of times the game was in play
            round = 0;
            //while loop until the someone dies
            while(r1.getCurrentLife()>0 || r2.getCurrentLife()>0){
                System.out.println("");
                System.out.println("ROUND "+round);
                System.out.println("");
                System.out.println(r1.getName()+" : "+r1.getCurrentLife()+"/"+r1.getMaxLife()); //shows life points of player 1
                System.out.println("Speed: "+r1.getSpeed()+"/"+r1.getMaxSpeed()); //shows speed points of player 1
                System.out.println(r2.getName()+" : "+r2.getCurrentLife()+"/"+r2.getMaxLife()); //shows life points of player 2
                System.out.println("Speed: "+r2.getSpeed()+"/"+r2.getMaxSpeed()); //shows speed points of player 2
                System.out.println("");
                System.out.println("*** PLAYER 1's TURN ***");
                //rogue Menu
                rogueMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r2.wound(r1.attack());
                            //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 2:
                        r1.heal(d.roll());
                        break;
                    case 3:
                        atkWillBeDodged = r1.dodge();
                        break;
                }
                if(r1.getCurrentLife()<=0 || r2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                System.out.println("");
                System.out.println("*** PLAYER 2's TURN ***");
                rogueMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r1.wound(r2.attack());
                        //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 2:
                        r2.heal(d.roll());
                        break;
                    case 3:
                        atkWillBeDodged = r2.dodge();
                        break;
                }
                if(r1.getCurrentLife()<=0 || r2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                round++;
            }
            System.out.println("");
            System.out.println("=== BATTLE END! ===");
            
            //to show the results
            if(r1.getCurrentLife()==r2.getCurrentLife()){
                System.out.println("It's a draw!");
            }else if(r1.getCurrentLife()>r2.getCurrentLife()){
                System.out.println(r1.getName()+" WINS!!!");
            }else if(r2.getCurrentLife()>r1.getCurrentLife()){
                System.out.println(r2.getName()+" WINS!!!");
            }else{
                System.out.println("It's a draw!");
            }
        }else if(clas==1 && clas2==2){
            //prints both of their stats
            //so i can probably just put this block of display method inside each class but i wasnt sure 
            //if i can disturb the classes as much because a template was given
            System.out.println("------ Player [1] ------");
            System.out.println("Name: "+w1.getName());
            System.out.println("Health: "+w1.getCurrentLife()+"/"+w1.getMaxLife());
            System.out.println("Strength: "+w1.getStrength());
            System.out.println("Dexterity: "+w1.getDexterity());
            System.out.println("Intelligence: "+w1.getIntelligence());
            System.out.println("Magic: "+w1.getCurrentMagic()+"/"+w1.getMaxMagic());
            System.out.println("");
            System.out.println("------ Player [2] ------");
            System.out.println("Name: "+r2.getName());
            System.out.println("Health: "+r2.getCurrentLife()+"/"+r2.getMaxLife());
            System.out.println("Strength: "+r2.getStrength());
            System.out.println("Dexterity: "+r2.getDexterity());
            System.out.println("Intelligence: "+r2.getIntelligence());
            System.out.println("Magic: "+r2.getSpeed()+"/"+r2.getMaxSpeed());
            System.out.println("");
            
            //start of battle
            System.out.println("=== BATTLE START! ===");
            System.out.println("");
            
            //variable to hold the number of times the game was in play
            round = 0;
            //while loop until the someone dies
            while(w1.getCurrentLife()>0 || r2.getCurrentLife()>0){
                System.out.println("");
                System.out.println("ROUND "+round);
                System.out.println("");
                System.out.println(w1.getName()+" : "+w1.getCurrentLife()+"/"+w1.getMaxLife()); //shows life points of player 1
                System.out.println("Magic: "+w1.getCurrentMagic()+"/"+w1.getMaxMagic());//shows Magic points of player 1
                System.out.println(r2.getName()+" : "+r2.getCurrentLife()+"/"+r2.getMaxLife()); //shows life points of player 2
                System.out.println("Speed: "+r2.getSpeed()+"/"+r2.getMaxSpeed()); //shows speed points of player 2
                System.out.println("");
                System.out.println("*** PLAYER 1's TURN ***");
                wizardMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r2.wound(w1.attack());
                        //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 2:
                        w1.heal(d.roll());
                        break;
                    case 3:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r2.wound(w1.castLightningBolt());
                        //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 4:
                        w1.heal(w1.castHeal());
                        break;    
                }
                if(w1.getCurrentLife()<=0 || r2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                System.out.println("");
                System.out.println("*** PLAYER 2's TURN ***");
                rogueMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        w1.wound(r2.attack());
                        break;
                    case 2:
                        r2.heal(d.roll());
                        break;
                    case 3:
                        atkWillBeDodged = r2.dodge();
                        break;
                }

                if(w1.getCurrentLife()<=0 || r2.getCurrentLife()<=0){
                //ends the loop immediately if someone dies
                    break;
                }else{}
                round++;
            }
            System.out.println("");
            System.out.println("=== BATTLE END! ===");
            
            //to show the results
            if(w1.getCurrentLife()==r2.getCurrentLife()){
                System.out.println("It's a draw!");
            }else if(w1.getCurrentLife()>r2.getCurrentLife()){
                System.out.println(w1.getName()+" WINS!!!");
            }else if(r2.getCurrentLife()>w1.getCurrentLife()){
                System.out.println(r2.getName()+" WINS!!!");
            }else{
                System.out.println("It's a draw!");
            }
            
        }else{
            
            System.out.println("------ Player [1] ------");
            System.out.println("Name: "+r1.getName());
            System.out.println("Health: "+r1.getCurrentLife()+"/"+r1.getMaxLife());
            System.out.println("Strength: "+r1.getStrength());
            System.out.println("Dexterity: "+r1.getDexterity());
            System.out.println("Intelligence: "+r1.getIntelligence());
            System.out.println("Magic: "+r1.getSpeed()+"/"+r1.getMaxSpeed());
            
            System.out.println("");
            System.out.println("------ Player [2] ------");
            System.out.println("Name: "+w2.getName());
            System.out.println("Health: "+w2.getCurrentLife()+"/"+w2.getMaxLife());
            System.out.println("Strength: "+w2.getStrength());
            System.out.println("Dexterity: "+w2.getDexterity());
            System.out.println("Intelligence: "+w2.getIntelligence());
            System.out.println("Magic: "+w2.getCurrentMagic()+"/"+w2.getMaxMagic());
            System.out.println("");
            
            //start of battle
            System.out.println("=== BATTLE START! ===");
            System.out.println("");
            
            //variable to hold the number of times the game was in play
            round = 0;
            //while loop until the someone dies
            while(r1.getCurrentLife()>0 || w2.getCurrentLife()>0){
                System.out.println("");
                System.out.println("ROUND "+round);
                System.out.println("");
                System.out.println(r1.getName()+" : "+r1.getCurrentLife()+"/"+r1.getMaxLife()); //shows life points of player 1
                System.out.println("Speed: "+r1.getSpeed()+"/"+r1.getMaxSpeed()); //shows speed points of player 1
                System.out.println(w2.getName()+" : "+w2.getCurrentLife()+"/"+w2.getMaxLife()); //shows life points of player 2
                System.out.println("Magic: "+w2.getCurrentMagic()+"/"+w2.getMaxMagic());//shows Magic points of player 2
                System.out.println("");
                System.out.println("*** PLAYER 1's TURN ***");
                //rogue Menu
                rogueMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        w2.wound(r1.attack());
                        break;
                    case 2:
                        r1.heal(d.roll());
                        break;
                    case 3:
                        atkWillBeDodged = r1.dodge();
                        break;
                }
                
                if(r1.getCurrentLife()<=0 || w2.getCurrentLife()<=0){
                    //ends the loop immediately if someone dies
                    break;
                }else{}
                System.out.println("");
                System.out.println("*** PLAYER 2's TURN ***");
                wizardMenu();
                cho=Integer.parseInt(br.readLine());
                switch(cho){
                    case 1:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r1.wound(w2.attack());
                        //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 2:
                        w2.heal(d.roll());
                        break;
                    case 3:
                        if(atkWillBeDodged){
                            System.out.println("Opponent has dodged your attacked");
                        }else{
                            r1.wound(w2.castLightningBolt());
                        //atkWillBeDodged is changed to false now so later on when the opponent didnt choose dodge the attack will go through
                            atkWillBeDodged=false;
                        }
                        break;
                    case 4:
                        w2.heal(w2.castHeal());
                        break;    
                }

                if(w2.getCurrentLife()<=0 || r1.getCurrentLife()<=0){
                //ends the loop immediately if someone dies
                    break;
                }else{}
                round++;
            }
            System.out.println("");
            System.out.println("=== BATTLE END! ===");
            
            //to show the results
            if(w2.getCurrentLife()==r1.getCurrentLife()){
                System.out.println("It's a draw!");
            }else if(w2.getCurrentLife()>r1.getCurrentLife()){
                System.out.println(w2.getName()+" WINS!!!");
            }else if(r1.getCurrentLife()>w2.getCurrentLife()){
                System.out.println(r1.getName()+" WINS!!!");
            }else{
                System.out.println("It's a draw!");
            }
            
        }
     
    } public static void wizardMenu(){
        System.out.println("----- MENU -----");
        System.out.println("| [1] Attack   |"
                       + "\n| [2] Heal     |"
                       + "\n| [3] Cast Lightning Bolt|"
                       + "\n| [4] Cast Heal|");
        System.out.print(": ");
    } public static void rogueMenu(){
        System.out.println("----- MENU -----");
        System.out.println("| [1] Attack   |"
                       + "\n| [2] Heal     |"
                       + "\n| [3] Dodge    |(next attack of other player will have a chance to be dodged)|");
        System.out.print(": ");
    }
    
}
