package src.basicdec23;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
//Take a user input and print the information
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=user_input.next();

        System.out.println("Enter your age");
        int age=user_input.nextInt();

        System.out.println("Enter your salary");
        double salary= user_input.nextDouble();

        System.out.println("Your details are " + name + "-" + age+ "-" + salary);
        System.out.println("Your age  is " + age);
        System.out.println("Your salary  is " + salary);
        user_input.close();

    }
}
