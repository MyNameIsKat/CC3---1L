package showstudent;

public class Student {
//data fields made acc to the pdf    
    private static String IDNumber;
    private static int CreditHours;
    private static String Points; //A=12, B=8, C=4, D=0
    private static double GradePointAve;

//putting data into the private field IDNumber    
    public Student setIDNumber(String id){
        IDNumber = id;
        return this;
    }
//putting data into the private field CreditHours    
    public Student setCreditHours(int ch){
        CreditHours =ch;
        return this;
    }
//putting data into the private field Points    
    public Student setPoints(String p){
//this was made in order for the displayed points to always be a capital letter        
        if(p.equalsIgnoreCase("A")){
            Points="A";
        }else if(p.equalsIgnoreCase("B")){
            Points="B";
        }else if(p.equalsIgnoreCase("C")){
            Points="C";
        }else{
            Points="D";
        }
        return this;
    }
//putting data into the private field GradePointAve    
    public Student setGradePointAve(){
    //computes accourding to the Points    
        switch(Points){
            case "A":
                GradePointAve=12/CreditHours;
                break;
            case "B":
                GradePointAve=8/CreditHours;
                break;
            case "C":
                GradePointAve=4/CreditHours;
                break;
            case "D":
                GradePointAve=0/CreditHours;
                break;
            default:
                GradePointAve=0/CreditHours;
                break;
        }
        return this;
    }
    
//prints all the data as a void 
    public void print(){
        System.out.println("Student ID: "+IDNumber
                + "\nCredit Hours: "+CreditHours
                + "\nPoints: "+Points
                + "\nGrade Point Average: "+GradePointAve);
        
    }
    
    
    
}
