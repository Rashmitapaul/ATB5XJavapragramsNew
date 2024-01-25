package src.basic_jan13.abstraction.interfaces.interviewquestion;

public class II1 {
    public static void main(String[] args) {
Hello h = new Hello();
h.say();
h.hello();
II i =new Hello();
i.hello();
    }
}
 interface II{
    Void say();
    default void hello(){
        System.out.println("Hello Default");
    }
 }

 interface p{}

class Hello implements II{


    @Override
    public Void say() {
        System.out.println("Say !!");
        return null;
    }

    @Override
    public void hello() {
        System.out.println("Hello of hello");
    }
}