package src.javaOOPSConceptCode.superkeyword;
public class A {
    int a= 10;
}
class B extends A{
    int a= 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}