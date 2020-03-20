package seatplan;

public class Airplane {

    public int row = 14;
    public int column= 7;
    public char[][] seats = new char [row][column];
    
    public void unoccupiedSeats(int userRow, int userColumn){    
        seats[userRow][userColumn]='X';
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                    if(seats[i][j]!='X'){
                        seats[i][j]='*';
                    }else{
                    }
                }
            }
        
        for(int iq=0;iq<row;iq++){
            for(int jq=0;jq<column;jq++){
                if(iq==0){
                    System.out.print("");
                }
                else if(jq==0){
                    System.out.print("\t");
                }else{
                    System.out.print(seats[iq][jq]+"\t");
                }
            }
            System.out.println("");
        }
    }
    
}
