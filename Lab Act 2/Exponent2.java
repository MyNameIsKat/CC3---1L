package exponent2;
import java.io.*;

public class Exponent2 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello!");
        System.out.println("I turn your input into its squared and cubed value");
//user inputs        
        System.out.print("Enter Input: ");
        int num = Integer.parseInt(br.readLine());
//displays        
        System.out.println("Your Input:"+num);
        System.out.println("Squared: "+square(num));
        System.out.println("Cube: "+cube(num));
    }
//method that squares the user input    
    public static double square(double num){
        double square=num*num;
        return square;
    }
//method that cubes using the number and the square    
    public static double cube(double num){
        double cube=num*square(num);
        return cube;
    }
}
