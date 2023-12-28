package src.basicdec16;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        //Take an input from user in java -yes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even/odd");
        int a = sc.nextInt();

        if (a%2 == 1){
            System.out.println("ODD NUMBER");

        }else {
            System.out.println("EVEN NUMBER");

        }

    }
}
