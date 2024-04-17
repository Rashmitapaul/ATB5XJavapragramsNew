package src.basic_oops_jan14.exceptions;

public class Lab164 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Exit");
//            System.exit(0); // JVM to stop//If uncomment this then o/p is Exit only
        } finally {
            System.out.println("I am final");
        }
    }
}
