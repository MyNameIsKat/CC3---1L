package showstudent;
import java.io.*;

public class ShowStudent {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//instantiate object s        
        Student s = new Student();
//user enters id number, credit hours earned which is usually 3hrs and the points which is equivalent to an A, B, C, D
        System.out.print("Enter ID Number(18-9999-420): ");
        String id = br.readLine();
        System.out.print("Credit Hours Earned (3hrs): ");
        int che = Integer.parseInt(br.readLine());
        System.out.print("Number Points(A, B, C, D): ");
        String p = br.readLine();

//having the fields in student as private, the mutators must be initialize
//by having the mutators and accessors in a chain method, the instatiating the way it looks like bellow
        s.setIDNumber(id).setCreditHours(che).setPoints(p).setGradePointAve().print();
    }
    
}
