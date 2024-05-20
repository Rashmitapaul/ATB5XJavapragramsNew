package src.corejavanewcode;


    class Program1{
    private static int x;
    static  void f1(){//you just add static
            x=5;
        }

    }
    public class Test006 {
    public static void main(String[] args) {
            Program1.f1();
        }
    }

