package src.basic_oops_jan14.interviewQ;

public class Interface2 {
    public static void main(String[] args) {
        System.out.println(PP.a);
       // foo f = new foo();//son
       // f.m1();
        PP f1 =new foo();//GM//This is dynamic dispatch
        rofl f2 = new foo();//Father
        f2.say();
    }
}
interface PP{
    int a= 20;
    void m1();
}

abstract class rofl implements PP{
    abstract void say();
}
class foo extends rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}