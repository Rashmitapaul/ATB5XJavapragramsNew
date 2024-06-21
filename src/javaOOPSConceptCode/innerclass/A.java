package src.javaOOPSConceptCode.innerclass;
//Member inner class
public class A {

        void m1() {
             System.out.println("m1-A");
             }
        class B {
             //static int i=10;--> Error
             static final int j=20;
             void m2()
            {
                 System.out.println("m2-B");
                 System.out.println(j);
                 }
             void m3()
             {
                 System.out.println("m3-B");
                 }
            }
        }
 class Test {
public static void main(String[] args)
 {
             A a=new A();
             a.m1();
             //a.m2();--> Error
             A.B ab=new A().new B();
             ab.m2();
             ab.m3();
             //ab.m1();--> Error
             }
}
