package src.javaOOPSConceptCode.superkeyword;

public class A3 {
    A3(){
        System.out.println("Hello Bulu");
    }
}
class B2 extends A3{
    B2(){
        //if we don't write super keywordJava compiler automatically write super keyword
        System.out.println("Hello world");

    }
}
class Test2 {
    public static void main(String[] args) {
        B2 r = new B2();

    }
}

