package src.basicdec16;

import java.util.Scanner;

public class Lab015 {

    public static void main(String[] args) {
        //concatenation operator

int a =10;
int b =34;
System.out.println(a+b);
String name = "Rashmita";
System.out.println(a+name);
System.out.println(name+a);
//important--- calculation go for left to right
 //concatenation = String + other
System.out.println(a+b+name);//It is adding 2 int ,in this case concatenation not happen.
        //All the + below are concatenation
        System.out.println(name+a+b);



    }


}
