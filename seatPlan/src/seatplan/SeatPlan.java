package seatplan;
import java.util.Scanner;

public class SeatPlan {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Airplane ap = new Airplane();
        
        ap.unoccupiedSeats(0, 0);
        
        short seatRow=0;
        short seatColumn=0;
        byte ticketType=0;
        byte userchoice=0;
        
        do{
            System.out.println("Enter Ticket Type"
                    + "\n [1] First Clas"
                    + "\n [2] Business Class"
                    + "\n [3] Economy Class"
                    + "\n : ");
            ticketType = sc.nextByte();
            
            switch(ticketType){
                case 1:
                    System.out.print("Enter row[1-3]: ");
                    seatRow = sc.nextShort();
                    System.out.print("Enter column[1-6]: ");
                    seatColumn =sc.nextShort();
                    break;
                case 2: 
                    System.out.print("Enter row[4-8]: ");
                    seatRow = sc.nextShort();
                    System.out.print("Enter column[1-6]: ");
                    seatColumn =sc.nextShort();
                    break;
                case 3:
                    System.out.print("Enter row[9-13]: ");
                    seatRow = sc.nextShort();
                    System.out.print("Enter column[1-6]: ");
                    seatColumn =sc.nextShort();
                    break;
            }
            
            ap.unoccupiedSeats(seatRow, seatColumn);
            System.out.println("Would you like to try again? "
                    + "\n:");
            userchoice= sc.nextByte();
        }while(userchoice==0);
    }
    
}
