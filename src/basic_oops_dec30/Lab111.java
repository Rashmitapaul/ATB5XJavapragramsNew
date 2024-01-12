package src.basic_oops_dec30;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the a");
        int a =sc.nextInt();
        System.out.println("Enter the b");
        int b =sc.nextInt();
        //Importance
        //The program not work if one of the value is "0".
        a=a+b;//43+12->55
        b=a-b;//55-12->43
        a=a-b;//55-43->12
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }
}
