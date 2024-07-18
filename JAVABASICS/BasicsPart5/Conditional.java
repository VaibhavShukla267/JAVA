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


// Set alarm on monday to friday different and for saturday and sunday different

// old syntax
String day="Wednesday";

// switch(day){
    //     case "Saturday","Sunday":
//     System.out.println("12PM");
//     break;

//     case "Monday":
//     System.out.println("8AM");
//     break;

//     default:
//     System.out.println("8:30AM");
// }
String Result="";
Result =switch(day){
    case "Saturday","Sunday"-> Result="12PM";
    
    case "Monday"->Result="8:30AM";
    default->Result="8:30AM";
};
System.out.println(Result);



String Day="Wednesday";

String Result1=" ";
Result1 =switch(Day){
    case "Saturday","Sunday":yield "12PM";

    case "Monday": yield "8:30AM";
    default: yield "8:30AM";
};
System.out.println(Result1);

}
