package BasicsPart2;

public class Type
 {
    


    public static void main(String n[]) {
        byte b=127;
        // int a=12;
        int a=b;
        // byte k=a;error

        byte k=(byte)a;

        float f=5.6f;
        // float f=(float)k;
        int i =(int)f;


        byte num1=30;
        byte num2=30;



        int result=num1*num2;

        
        System.out.println(result);
        System.out.println(i);
        System.out.println(k);
        System.out.println(a);



        // a=b; No Error
        // b=a;Error

        // System.out.println(a=b);
        // Implicit Conversion

        // System.out.println(b=(byte)a);
        // Explicit Conversion or Casting 

        
    }
}

