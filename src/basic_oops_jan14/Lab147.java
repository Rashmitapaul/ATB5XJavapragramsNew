package src.basic_oops_jan14;

public class Lab147 {
    public static void main(String[] args) {
       // P01 p01;//in o/p nothing will be printed
        //here one time  class is loaded
        P01 p01= new P01();
        P01 p02= new P01();
//Above 2 program one time called
        p01.m1();
        p01.m2();

        P01 p03 = null;

        p03.m1();//here object not created this is not possible
        p03.m2();//static this is possible
    }

}
class P01{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    int a = 10;// non static instance variable
    static int b = 20;//static

    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(){
       // System.out.println(a);//not possible because static function can't have a instance variable
        System.out.println(b);
    }

}
