
package BasicsPart4;

/**
 * Realtional
 */
public class RelationalLogical {
    public static void main(String[] args) {


        int x=5;
        int y=6;
        int z=7;
        int a=8;
        boolean result= x>y;
        boolean result1= z==y;
        boolean result2= x<=y;
        boolean result3= x>=y;
    
        System.out.println(x==y);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


        boolean res=x<y&&z>a;//false T F=>F
        boolean res4=x>y&&z<a;//false F T=>F
        boolean res5=x>y&&z<a;//false F F=>F
        // boolean res5=x>y&&z>a;//false




        boolean res1=x<y||z>a;//true
        boolean res2=x>y||z<a;//true
        boolean res3=x>y||z>a;//false


        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        
    }

    
}