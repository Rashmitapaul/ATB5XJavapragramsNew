package src.javaOOPSConceptCode.superkeyword;

public class A4 {

        A4(int a){
            System.out.println("Hello Bulu"+" " + a);
        }
    }
    class B3 extends A4 {
        B3(){
            super(10);//If you have  parameterised constructor  den compulsory to write super keyword
            System.out.println("Hello world");

        }
    }
    class Test3 {
        public static void main(String[] args) {
            B3 b = new B3();

        }
    }
