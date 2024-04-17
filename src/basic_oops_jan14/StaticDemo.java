package src.basic_oops_jan14;

public class StaticDemo {
    //Static variable
    public static String college_name="Mayurbhanjschoolofengineering ";

    //Non static variable --> local variable and instance variable

    public int version=3;//version is a instance variable


    //static method

    public static void printname(){
        int age =10;//this is the local variable
        System.out.println("Name is :" + college_name);
       // System.out.println("Version is : " + version);
        //You can't have ainstance variable into the static method
    }
    //Non static method

    public void printversion(){
        int age= 10;
        System.out.println("Version is : " + version);
        System.out.println("Name is :" + college_name);
    }
}
