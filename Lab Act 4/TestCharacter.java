package RPG;
import java.io.*;
import java.util.Random;
/**
 * am using NetBeans to code and i wasn't sure of what to do with 3java classes with different names
 * and all of them inside a package with another name, when netbeans creates the main class the same name as the package name.
 * so I just made a TestCharacter as my main class and renamed the package name as RPG.
 * so i only have three java classes but the package on top indicates that its all in one package named RPG
 **/

public class TestCharacter {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dice d = new Dice();
        
        System.out.println("*************************"
                + "\n***** THAT RPG GAME *****"
                + "\n*************************");
        
        int cho = 0;
    //variables to hold the needed variables for the param    
        String name="john";
        int strength=0;
        int dexterity=0;
        int intelligence=0;
        int maxHealth;
        int currentHealth;
        br.readLine();
    
    //to write the username    
        System.out.println("----- Player[1]Status -----");
        System.out.print("Enter Name: ");
        name = br.readLine();
        System.out.println("Your stats will be randomly generated");
    //to create a threadlike space    
        br.readLine();
    
    //the loop for generating random stats 
    //loops until the user doesnt want to generate random stats anymore
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
    //to make cho 0 again so that the while loop for the player two can go again    
        cho = 0;
        
    //object initiated with the varables genrated     
        Character p1 = new Character(name, strength, dexterity, intelligence);
        System.out.println("PLAYER 1 has successfully created their account\n");
    
    //player2's turn
        System.out.println("----- Player[2]Status -----");
        System.out.print("Enter Name: ");
        name = br.readLine();
        System.out.println("Your stats will be randomly generated");
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
        Character p2 = new Character(name, strength, dexterity, intelligence);
        System.out.println("PLAYER 2 has successfully created their account\n");
    
    //prints both of their stats    
        System.out.println("------ Player [1] ------");
        System.out.println("Name: "+p1.getName());
        System.out.println("Health: "+p1.getCurrentLife()+"/"+p1.getMaxLife());
        System.out.println("Strength: "+p1.getStrength());
        System.out.println("Dexterity: "+p1.getDexterity());
        System.out.println("Intelligence: "+p1.getIntelligence());
        System.out.println("");
        System.out.println("------ Player [2] ------");
        System.out.println("Name: "+p2.getName());
        System.out.println("Health: "+p2.getCurrentLife()+"/"+p2.getMaxLife());
        System.out.println("Strength: "+p2.getStrength());
        System.out.println("Dexterity: "+p2.getDexterity());
        System.out.println("Intelligence: "+p2.getIntelligence());
        System.out.println("");
        
    //start of battle    
        System.out.println("=== BATTLE START! ===");
        System.out.println("");
    
    //variable to hold the number of times the game was in play    
        int round = 0;
    //while loop until the someone dies     
        while(p1.getCurrentLife()>0 || p2.getCurrentLife()>0){
            System.out.println("");
            System.out.println("ROUND "+round);
            System.out.println("");
            System.out.println(p1.getName()+" : "+p1.getCurrentLife()+"/"+p1.getMaxLife());
            System.out.println(p2.getName()+" : "+p2.getCurrentLife()+"/"+p2.getMaxLife());
            System.out.println("");
            System.out.println("*** PLAYER 1's TURN ***");
            menu();
            cho=Integer.parseInt(br.readLine());
            switch(cho){
                case 1:
                    p2.wound(p1.attack());
                    break;
                case 2:
                    p1.heal(d.roll());
                    break;
            }
            if(p1.getCurrentLife()<=0 || p2.getCurrentLife()<=0){
                //ends the loop immediately if someone dies
                break;
            }else{}
            System.out.println("");
            System.out.println("*** PLAYER 2's TURN ***");
            menu();
            cho=Integer.parseInt(br.readLine());
            switch(cho){
                case 1:
                    p1.wound(p2.attack());
                    break;
                case 2:
                    p2.heal(d.roll());
                    break;
            }
            if(p1.getCurrentLife()<=0 || p2.getCurrentLife()<=0){
                //ends the loop immediately if someone dies
                break;
            }else{}
            round++;
        }
        System.out.println("");
        System.out.println("=== BATTLE END! ===");
    
    //to show the results    
        if(p1.getCurrentLife()==p2.getCurrentLife()){
            System.out.println("It's a draw!");
        }else if(p1.getCurrentLife()>p2.getCurrentLife()){
            System.out.println(p1.getName()+" WINS!!!");
        }else if(p2.getCurrentLife()>p1.getCurrentLife()){
            System.out.println(p2.getName()+" WINS!!!");
        }else{
            System.out.println("It's a draw!");
        }
    }
    //to show the menu
    public static void menu(){
        System.out.println("----- MENU -----");
        System.out.println("| [1] Attack   |"
                       + "\n| [2] Heal     |");
        System.out.print(": ");
    }
}
