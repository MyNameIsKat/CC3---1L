package prices;
import java.util.Scanner;

public class Prices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prices [] = new double [20];
        double sum = 0;
        double ave = 0;
//input for the prices
        for(int i = 0;i<prices.length;i++){
            System.out.print("Enter ["+i+"] Price: $");
            prices[i]=sc.nextDouble();
            //for the sum
            sum+=prices[i];
        }
//displays the total sum        
        System.out.println("TOTAL SUM: "+sum);
//displays all values less than $5.00
        System.out.println("VALUES LESS THAN $5.00");
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<5.00){
                System.out.print("| ");
                System.out.print("$"+prices[i]+" ");
            }
        }
//calculates the average and displays it        
        ave=sum/prices.length;
        System.out.println("\nAVERAGE PRICE: $"+ave);
//displays all values more than the average      
        System.out.println("VALUES MORE THAN THE AVERAGE($"+ave+")");
        for(int i = 0;i<prices.length;i++){
            if(prices[i]>ave){
                System.out.print("| ");
                System.out.print("$"+prices[i]+" ");
            }
        }
    }
    
}
