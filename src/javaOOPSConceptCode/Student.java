package src.javaOOPSConceptCode;
//Example of single inheritance

public class Student {//Super class
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name and marks");
    }
}
class Rashmi extends Student//sub class
{
    void display()
    {
      roll=1;name="Rashmi";marks=78;
        System.out.println(roll+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        Rashmi r =new Rashmi();
        r.input();
        r.display();
    }
}