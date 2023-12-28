package src.basicdec16;

public class Lab028 {
    public static void main(String[] args) {
        String name = "My name is Rashmita Paul";
        String name1 = "My name is Rashmita Paul";// name and name1 store in SCP
        String name2 = new String("My name is Rashmita Paul");// this is OA
String name3 = new String("My name is Rashmita paul");


       // System.out.println(name == name1);
       // System.out.println(name.equals( name1));
        System.out.println(name == name2);
        System.out.println(name.equals( name2));
        System.out.println(name.equalsIgnoreCase( name3));




    }
}
