package src.javaOOPSConceptCode.constructor;
//Java constructor
public class ClassA {
    int a;String name;

    ClassA(){
        a=0; name= null;
    }
    void show(){
        System.out.println(a+ " "+ name);
    }
}
class B{
    public static void main(String[] args) {
        ClassA a1= new ClassA();
        a1.show();
    }
}



























