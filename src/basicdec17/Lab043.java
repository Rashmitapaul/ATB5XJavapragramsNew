package src.basicdec17;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        // if else loop
        //2 conditions yes or no

     //  if (true){

       //    System.out.println("true");
      // }else{
      //     System.out.println("false");
      // }

    //    if (true){

    //        System.out.println("Only if");
     //   }

        //Multiple condition for if-->user enter number -->20,<20,<10
        //if, else if, else
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >20) {
            System.out.println("Number is > 20");
        }else if (number >10){
            System.out.println("Number is > 10");
        }else  {
            System.out.println("Number is < 20");
        }






    }
}
