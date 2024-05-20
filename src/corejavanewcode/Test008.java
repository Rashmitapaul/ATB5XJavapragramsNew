package src.corejavanewcode;

class Ab {
   private int x;
    private static int y;

    void fun1() {
        y = 22;
        x=5;
    }

    void fun2() {
        System.out.println(x);
    }

    void fun3() {
        y = 45;


    }
}
public class Test008 {
    public static void main(String[] args) {
        Ab a1 = new Ab();
        Ab a2 =new Ab();
        a1.fun1();
        a2.fun2();



    }
}

