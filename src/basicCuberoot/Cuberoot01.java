package src.basicCuberoot;

import java.util.Scanner;

public class Cuberoot01 {
    public static void main(String[] args) {
// User will enter the value of x,y,z
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value  x,y,z to calculation");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            System.out.println("The output is  " + (Math.cbrt(x * x + y * y - Math.abs(z))));


        }
}
