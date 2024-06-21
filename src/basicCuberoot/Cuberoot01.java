package src.basicCuberoot;

import java.util.Scanner;

public class Cuberoot01 {
    public static void main(String[] args) {
// You have to tell JVM which input user is enter.
        // sc.next()--> String
        //sc.nextINT();
        // sc.nextDouble();
        //sc.nextBoolean();
        //sc.nextFloat();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value  X");
            double x = sc.nextDouble();
        System.out.println("Enter the value  Y");
            double y = sc.nextDouble();
        System.out.println("Enter the value  Z");
            double z = sc.nextDouble();

            double result = 0;
            // 3/ X^2 + Y^2 - |Z|
        // A+B+C--> A-> X^2,B-> Y^2 , C-> |Z|
        // |-1|-> 1
        result = Math.cbrt(Math.pow(x,2 ) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);
     // Scanner steam should br closed after we are done.
        sc.close();

        }
}
