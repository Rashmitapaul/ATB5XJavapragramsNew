package src.javaOOPSConceptCode.constructor;

public class ClassA1 {
    // Example of default constructor
    int a;String b; boolean c;

    ClassA1(){//default constructor
        a=100; b="Ankit";c= true;
    }
    void Display(){
        System.out.println(a+ " "+b+" "+c);
    }
}
class B2{
    public static void main(String[] args) {
        ClassA1 a1= new ClassA1();
        a1.Display();
    }
}

