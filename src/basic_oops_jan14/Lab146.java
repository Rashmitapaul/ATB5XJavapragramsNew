package src.basic_oops_jan14;

public class Lab146 {
    public static void main(String[] args) {
       // System.out.println(StaticDemo.college_name);
       // StaticDemo.printname();


        StaticDemo s1 = new StaticDemo();//instance variable are changing but static variable are not changing
        s1.version=199;
        s1.printversion();

        StaticDemo.college_name="TTA";


        StaticDemo s2 = new StaticDemo();
        s2.version=299;
        s2.printversion();
    }
}
