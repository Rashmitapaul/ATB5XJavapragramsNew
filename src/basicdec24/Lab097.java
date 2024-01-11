package src.basicdec24;

public class Lab097 {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a  leap year
        //A leap year is divisible by 400
        // but not by 100 unless it is also divisible by 400.
        //Use an if-else statement to make this determination.



        //Coding->
        //1.User input
        //2.Rough code ->year%4 == 0 and ((year%100 != 0) or (year%400==0))
        //3.Brute force
        //4.Logic correction


        int year = 1900;
        if ((year%4 == 0 && year%100 != 0) || (year%400==0)){
            System.out.println("Leap Year");
        }else{

            System.out.println(" Not a Leap Year");
        }

        int year1 = 2000;
        if ((year%4 == 0 && year%100 != 0) || (year%400==0)){
            System.out.println("Leap Year");
        }else{

            System.out.println(" Not a Leap Year");
        }
    }
}
