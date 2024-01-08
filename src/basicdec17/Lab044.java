package src.basicdec17;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        //Grade calculator
        // Write a program that calculate and displayed the letter grade for a given numeric score.
        //e.g.,A, B, C, D, F
       // GRade scale:
        //A= 90-100
        //B= 80-89
        //C= 70-79
        //D= 60-69
        //F= 0-59


        //Step 1.Input from user
        //Score (Data type)-->int --> Grade (char or String)
        //Step 2.Basic logic or Brute force logic write basic rough code
        //if score >= 90 && Score =<100 --> Print A
        //else if score >= 80 && Score 89 =<100 --> Print B
        //Step 3.Write the real code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Your score -> A");
        }else if (score >= 80 && score <= 89){
            System.out.println("your score -> B");
        }else if (score >= 70 && score <= 79){
            System.out.println("your score -> C");
        }else if (score >= 60 && score <= 69){
            System.out.println("your score -> D");
        }else {
            System.out.println("your score -> F");
        }
        // Step 4.Debug the code
        //We are debug and checking the code-->input
        // Step 5.Fix the code and final it
    }
}
