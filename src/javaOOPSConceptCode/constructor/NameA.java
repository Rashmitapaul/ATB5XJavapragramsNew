package src.javaOOPSConceptCode.constructor;
//Private constructor
public class NameA {
    int a;
    double b;
    String c;

    private NameA() {
        a = 10;
        b = 30.43;
        c = "Amit";
        System.out.println(a + " " + b + " " + c);

    }

    public static void main(String[] args) {
        NameA a = new NameA();
    }
}

//class B{
   // public static void main(String[] args) {//you can't run code because private constructor can not access outside of class
      //  NameA a= new NameA();
   // }
//}