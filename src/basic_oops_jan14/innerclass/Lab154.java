package src.basic_oops_jan14.innerclass;

public class Lab154 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };



    }
}
