package src.opps_jan06;

public class Lab132 {
    public static void main(String[] args) {
        //OOPS concept
        //Person -> This is a class blueprint
        //p -> ref variable
        //new Person() -> real object
        Person p = new Person();
         p.name ="Amit";
         System.out.println(p.name);

        Person p2 = new Person();
        p2.name ="Amit";
        System.out.println(p.name);

        new Person();
        System.out.println();//This is empty

        new Person();
        Person p3 =null;//this is have a null area
        System.out.println();


    }
}
