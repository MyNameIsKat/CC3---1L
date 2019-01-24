package labexer01;
import java.io.*;

public class LabExer01 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int []arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter for index "+i+" : ");
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    
}
