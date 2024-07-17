package BasicsPart5;

public class Conditional {

    public static void main(String[] args) {
        
        // int a=16;
        int a=6;
        int b=6;
        int c=8;
    
    
    
        if(a<=b && b>=a){
            System.out.println("b is greater or equal");
            System.out.println("Thanku");
        }

        else{
        System.out.println("a is greater");
        System.out.println("Hello");
        }


//printing greatest number
        if(a>b && a>c)
        System.out.println("a is greatest");
        else if(b>c)
        System.out.println("b is greatest");
        else
        System.out.println("c is greatest");



// Ternary Operator
int num=4;
int res=num%2==0 ? 10 : 20;
System.out.println(res);




//Switch Statement
int n=3;


switch (n) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    case 4 -> System.out.println("Thursday");
    case 5 -> System.out.println("Friday");
    case 6 -> System.out.println("Saturday");
    case 7 -> System.out.println("Sunday");
    default -> System.out.println("Enter Valid Number");
}







    }

}
