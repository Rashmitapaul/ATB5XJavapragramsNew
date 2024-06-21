package src.javaOOPSConceptCode.instanceblock;

public class A1 {
    int a,b;
   static void show(){// first call static  method

        System.out.println("Learn coding");

    }
    A1(){//default constructor
        a=30;b= 40;
        System.out.println(a+" "+b);
    }
    {//This is a instance block
        a=12; b=45;
        System.out.println(a+" "+b);
    }
}
class B1{
    public static void main(String[] args) {
        A1.show();
        A1 r= new A1();
        //A1.show();
    }
}
