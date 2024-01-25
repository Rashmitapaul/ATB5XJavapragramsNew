package src.basic_jan13.abstraction.interfaces.interviewquestion;

public class Lab145 {
    public static void main(String[] args) {
        //Interface

    }
}
interface I1{}
interface I2{}

class A{}
class B{}

abstract class C{}
abstract class D{}

class Test1 extends A{}//Single inheritance
//class Test2 extends A,B{}//Not possible extends 2 class
class Test3 implements I1{}
class Test4 implements I1,I2{}
class Test5 extends A implements I1,I2{}//This is hybrid inheritance
//class Test6 implements I1 extends A{}//This is not possible because of implements always present in last.
//interface I1 extends A{}//Interface can't be extends anyone.
//interface I1 implements A{}//Interface can't be implements anyone.
//interface I1 extends A,B{}//Interface can't be extends anyone.Not possible
interface I6 extends I1,I2{}//Interface can be extends any interface.


