package src.basic_jan13.polymorphism.methodOverloading;

public class Person {
    //Method overloading
    void Speaker(String a){
        System.out.println("A is a String" + a);
    }

   // void Speaker(int x){
       // System.out.println("X is a int" + x);
  //  }
    //Or
    int Speaker(int x){
        System.out.println("X is a int" + x);
        return x;
    }

    void Speaker(double y){
        System.out.println("Y is a double" + y);
    }
}
