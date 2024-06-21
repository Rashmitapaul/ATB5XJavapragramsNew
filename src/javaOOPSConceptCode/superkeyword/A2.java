package src.javaOOPSConceptCode.superkeyword;

 class A2 {
    void show(){
        System.out.println("Hello Bulu");
    }
}
class B1 extends A2{
    void show(){
        super.show();
        System.out.println("Hello world");

    }
}
class Test1 {
    public static void main(String[] args) {
        B1 r = new B1();
        r.show();
    }
}
