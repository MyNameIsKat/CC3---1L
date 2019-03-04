package salary;
import java.io.*;

public class Salary {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//User inputs payrate, regular hours, and overtime hours
        System.out.println("Employee Weekly Salary Computer");
        System.out.print("Enter Hourly Pay Rate:");
        double hpr = Double.parseDouble(br.readLine());
        System.out.print("Enter Regular Hours: ");
        double rh = Double.parseDouble(br.readLine());
        System.out.print("Enter Overtime Hours: ");
        double oh = Double.parseDouble(br.readLine());
        System.out.println("Employee Salary: "+overtimePay(hpr,rh,oh));
        
    }
    public static double overtimePay(double hpr, double rh, double oh){
//computes salary with the overtime pay
        double op=(rh*hpr)+(oh*(1.5*hpr));
        return op;
    }
    
}
