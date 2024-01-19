package src.basic_jan07;

import java.util.Scanner;

public class Lab136 {
    public static void main(String[] args) {
//Person_136  p = new Person_136 ();
//new Person_136 ();
//Person_136  p1;//not call default value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String name = sc.next();



        Person_136 p2 = new Person_136("Rashmita");
        p2.printDetails();

        System.out.println("Enter the second name");
        String name2 = sc.next();

        Person_136 p3 = new Person_136(name2);
        p3.printDetails();

sc.close();
         //p -> null
        //p2 -> Rashmita
        //p3 -> Beauty
    }
}
