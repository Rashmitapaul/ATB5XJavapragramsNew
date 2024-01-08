package src.basicdec17;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
       // if,switch - Condition based
        //Loops --> which will repeat something - for, while, do while

        //Switch - Condition based
        //It can also do  multiple condition


        //Which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7 , I will tell which day it is ");
        //1->Monday 7->Sunday
        int dayNumber= sc.nextInt();


        switch (dayNumber){
           // default:
              //  System.out.println("ARE YOU MADE");
               // break;//if default is their in first point here break is need

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ARE YOU MADE");
                break;//This break optional if default their in last option



        }

        System.out.println("- END OF THE PROGRAM -");
    }
}
