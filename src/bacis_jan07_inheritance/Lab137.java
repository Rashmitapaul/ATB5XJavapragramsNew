package src.bacis_jan07_inheritance;

public class Lab137 {
    public static void main(String[] args) {
        Programming p = new Programming();//Parent class/Super class/Base class
        //How JVM understand this program
        //Programming -> class
        //p -> ref to the object
        //new Programming() ->object
        //Default constructor is called
        p.printInfo();

        Programming p2 = new Programming("perl" ,12);
        //How JVM understand this program
        //Programming -> class loader
        //p2 -> ref to the object
        //new Programming() ->object
        // param constructor is called

        p2.printInfo();
    }
}
