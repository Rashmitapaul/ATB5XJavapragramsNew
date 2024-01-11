package src.basicdec24;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the first subject");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the second subject");

        marks[1]=sc.nextFloat();
        System.out.println("Enter the third subject");

        marks[2]=sc.nextFloat();
        System.out.println("Enter the fourth subject");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the fiftieth subject");
        marks[4]=sc.nextFloat();
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
      sc.close();

    }
}
