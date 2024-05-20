package src.javaOOPSConceptCode;
//Multilevel inheritance

public class SuperClass {
    int a,b,c;
    void add(){
        a=12;b=22;
        c=a+b;
        System.out.println("Sum of two number "+c);
    }
    void sub(){
        a=200;b=100;
        c=a-b;
        System.out.println("Sub of two number "+c);
    }
}
class subclass1 extends SuperClass
{
    void multi(){
        a=12;b=22;
        c=a*b;
        System.out.println("Multiplication of two number "+c);

    }
    void div(){
        a=12;b=2;
        c=a/b;
        System.out.println("Division of two number "+c);

    }
}
class Subclass2 extends subclass1
{
    void rem(){
        a=10;b=3;
        c=a%b;
        System.out.println("Remainder of two number "+c);
    }
}
class TC{
    public static void main(String[] args) {
        Subclass2 s1 = new Subclass2();
        s1.add();
        s1.sub();
        s1.multi();
        s1.div();
        s1.rem();
    }
}