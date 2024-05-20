package src.corejavanewcode;
class Area{
    static void fun1(){
        System.out.println("BPD");
    }
    static void fun2(){
        System.out.println("BLS");
    }

}
public class Test003 {
    static void fun1(){
        System.out.println("A");
    }
    static void fun2(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        System.out.println("C");
        fun1();
        fun2();
        Area.fun1();//this code means call the Area class function
        Area.fun2();
    }
}
