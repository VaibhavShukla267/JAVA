package JAVAOOP.Part1;

public class Demo1 {
    public static void main(String[] args) {

        Myclass Student=new Myclass();
        String Result=Student.IsStudent("Vaibhav");
        String Result1=Student.student("Vaibhav","MCA CS DEPARTMENT");
        // int MobileNumber = 0;
        String Result2=Student.StudentData("","",9309);


        System.out.println(Result);
        System.out.println(Result1);
        System.out.println(Result2);
        

        
    }
}


class Myclass{
    Boolean IsStudent=true;
    String Output;
    
    public String IsStudent(String UserName) {
        if(IsStudent)
         Output="Welcome "+UserName;
        
        return Output;
        
    }
    public String student(String Username,String Branch){
        
        if(IsStudent){
            System.out.println("Student Details");
            System.out.println("Name: "+Username);
            System.out.println("Branch: "+Branch);
        }
       return"";
    }
    public String StudentData(String Username,String Branch,long MobileNumber){
        
        if(IsStudent){
            System.out.println("MobileNumber: "+MobileNumber);
        }
       return"Thank You For Visiting Our Site";
    }

}
