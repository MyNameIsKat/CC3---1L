package labexer01;
import java.util.Scanner;

public class LabExer01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter for index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("First to Last: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nLast to First: ");
        for(int i=(arr.length-1);i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
