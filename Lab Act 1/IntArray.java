package intarray;
import java.util.Scanner;

public class IntArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userLength=0;
//user makes an array
        System.out.println("Make an Array!!!");
//user types in the length of the array first        
        System.out.print("Index number: ");
        userLength = sc.nextInt();
//array is created        
        int [] arr = new int[userLength];
//ask the user to populate the array        
        for(int i = 0; i<arr.length;i++){
            System.out.println("Element ["+i+"]: ");
            arr[i]=sc.nextInt();
        }
//displays the array from first to last        
        System.out.println("\nYOur array arranged first to last");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
//displays the array from last to first        
        System.out.println("\nYour array aranged last to first");
        for(int i =(arr.length-1);i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
