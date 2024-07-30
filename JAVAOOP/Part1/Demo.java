package JAVAOOP.Part1;






public class Demo {
    public static void main(String[] args) {

        int num1=20;
        int num2=30;

        Calculator cal=new Calculator();//object is being created here and a memory is also assigned.
        int Result=cal.Add(num1, num2);
        int Result1=cal.Sub(num1, num2);
        int Result2=cal.Mul(num1, num2);
        int Result3=cal.Div(num1, num2);


        System.out.println("********MY CALCULATOR******");
        System.out.println(num1+"+"+num2+"= "+Result);
        System.out.println(num1+"-"+num2+"= "+Result1);
        System.out.println(num1+"*"+num2+"= "+Result2);
        System.out.println(num1+"/"+num2+"= "+Result3);
        

        
        
    }
}

    class Calculator{
        public int Add(int n1,int n2){
            int r=n1+n2;
            return r;
        }

        public int Sub(int n1,int n2){
            int r=n1-n2;
            return r;
        }
    
        public int Mul(int n1,int n2){
            int r=n1*n2;
            return r;
        }
    
        public int Div(int n1,int n2){
            int r=n1/n2;
            return r;
        }
    }
