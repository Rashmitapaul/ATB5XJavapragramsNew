package src.javaOOPSConceptCode.constructor;

public class C {
    //Constructor overloading
    int a;
    double b;
    String c;

    C() {
        a = 11;
        b = 34.50;
        c = "Beauty";
      //  System.out.println(a+" "+b+" "+c);

    }

    C(int x) {
a=x;
    }

    C(double y, String z) {
b=y;c=z;
    }

}
class name{
    public static void main(String[] args) {


        C r = new C();
        C r1 = new C(45);
        C r2 = new C(45.50, "Ajit");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r1.a);
        System.out.println(r2.b+" "+r2.c);

    }
}
