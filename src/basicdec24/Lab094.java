package src.basicdec24;

import java.util.Scanner;

public class Lab094 {
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
                    if(marks[i]< 30){// who will pass and who will be fall by using the "if" condition
                        System.out.println("You are fall in this subject" + marks[i]);
                    }
                    System.out.println(marks[i]);

                }
                sc.close();


        }

    }

