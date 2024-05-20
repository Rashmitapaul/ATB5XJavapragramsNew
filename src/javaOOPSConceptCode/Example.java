package src.javaOOPSConceptCode;

public class Example {
    //Crete class and object
    int a =10;
    String b ="Rashmi";
    void Show(){//create a method
        System.out.println(a+" "+b);
    }
}
class Test{
    public static void main(String[] args) {


        Example e1 = new Example();//create object
        e1.Show();
        //or
        //Example e1;
        //e1=new Example();
        //e1.Show();
    }

}