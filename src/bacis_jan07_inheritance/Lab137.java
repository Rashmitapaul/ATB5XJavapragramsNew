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

    public static class Dog_137 {
        String name;//Instance variable

        Dog_137(){
            System.out.println("DC");
        }
        Dog_137(String nameref){
            this.name= nameref;
            System.out.println("DC");
        }
        void bark(){
            int age = 10;
            System.out.println("Bark");
            System.out.println("Dog name is ->" + this.name);
        }
    }
}
