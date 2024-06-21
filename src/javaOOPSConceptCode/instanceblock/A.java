package src.javaOOPSConceptCode.instanceblock;
//Instance block
public class A {
    int a,b;
    void show(){// normal method
        a=20;b= 10;
        System.out.println(a+" "+b);

    }
    A(){//default constructor
        a=30;b= 40;
        System.out.println(a+" "+b);
    }
    {//This is a instance block
        a=12; b=45;
        System.out.println(a+" "+b);
    }
}
class B{
    public static void main(String[] args) {
        A r= new A();
        r.show();
    }
}