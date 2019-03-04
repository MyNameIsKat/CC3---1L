package pizzachoice;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PizzaChoice {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double pizzaPrice [] = {6.99, 8.99, 12.50, 15.00};
        String []pizzaSize  = {"S", "M", "L", "X"};
        String userCho = "A";
        int tryAgain = 0;
        final JPanel panel = new JPanel();
        boolean check=false;
//while loop to keep the code running even if theres an error or the user wants to try again   
        while(check==false){           
//asks the user            
            System.out.println("Enter Pizza Size("+pizzaSize[0] +" "+ pizzaSize[1]+" "+ pizzaSize[2]+" "+pizzaSize[3]+") :");
//try and catch to catch syntax errors commited by the user's input
            try{
//user inputs                
                userCho = br.readLine();
//if else to check if the user's choice is in the menu             
                if(userCho.equals(pizzaSize[0])||userCho.equals(pizzaSize[1])||userCho.equals(pizzaSize[2])||userCho.equals(pizzaSize[3])){
//cascading if else so that the output follows the user's choice
                    if(userCho.equals(pizzaSize[0])){
                        System.out.println("The prize of small pizza is "+pizzaPrice[0]);
                    }else if(userCho.equals(pizzaSize[1])){
                        System.out.println("The prize of medium pizza is "+pizzaPrice[1]);
                    }else if(userCho.equals(pizzaSize[2])){
                        System.out.println("The prize of large pizza is "+pizzaPrice[2]);
                    }else if(userCho.equals(pizzaSize[3])){
                        System.out.println("The prize of extra large pizza is "+pizzaPrice[3]);
                    }
//ask the user to try again if they want to                
                    System.out.println("Would you like to try again? [PRESS 0] yes [PRESS 1] no");
                    tryAgain= Integer.parseInt(br.readLine());
//if they said yes the while loop with the condition check==false, will remain with false value
                    if(tryAgain == 0){
                        check = false;
                    }else{
//unless the user types 1 or above the while loop will exit because check is no longer equal to false                        
                        System.out.println("HAVE A NICE DAY!");
                        check =true;
                    }
                }else{
//error message when the user types values that are not S, M, L or X                    
                    JOptionPane.showMessageDialog(panel, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
//error message when the user commits a sysntax error                
                JOptionPane.showMessageDialog(panel, e, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        

        
    }
    
}
