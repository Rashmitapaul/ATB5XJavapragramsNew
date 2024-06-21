package src.javaOOPSConceptCode.factorymethod;
//Factory Method
public class A {
    private A() {
             System.out.println("A-con");
             }
 void m1() {
        System.out.println("m1-A");
             }
 static A getRef()//Factory Method
 {
             A a = new A();
             return a;
            }
}
class Test {
public static void main(String args[]) {
    A a = A.getRef();
    a.m1();
}
}



































