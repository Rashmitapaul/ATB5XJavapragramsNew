package src.javaOOPSConceptCode.constructor;

public class A2 {
    // Example of Parameterized constructor
    int x,y;//here we are declear as a instance variable

    A2(int a ,int b){//Parameterized constructor
        x=a; y= b;
    }
    A2(int a ,String b){//Parameterized constructor
        System.out.println(a+ " "+b);
    }
    void Display(){
        System.out.println(x+ " "+y);
    }
}
class B3{
    public static void main(String[] args) {
        A2 a1= new A2(100,200);
        a1.Display();
        A2 a2= new A2(100,"Anu");
       // a1.Display();
    }
}


