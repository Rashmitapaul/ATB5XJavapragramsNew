package src.basic_oops_dec30;

import java.util.Scanner;

public class Lab110 {
    public static void main(String[] rashmi) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the a");
        int a =sc.nextInt();
        System.out.println("Enter the b");
        int b =sc.nextInt();
//swapping the number
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);

    }
}
