package src.basic_oops_jan14.interviewQ;

public class Abstract01 {
}

abstract class Person01{
    abstract void say();//This is abstract incomplete method
    void eat(){//This is abstract complete method
        System.out.println("Hello eat from person");
    }
}
abstract class Student1 extends Person01{
    abstract void m2();

}
class Person02 extends Student1{

    @Override
    void say() {

    }

    @Override
    void m2() {

    }
}