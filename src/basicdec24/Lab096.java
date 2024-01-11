package src.basicdec24;

public class Lab096 {
    public static void main(String[] args) {
        //Most important
        //FizzBuzz Problem:-
        //Write a program that prints number 1 to 100.
        //For multiples of 3, print "Fizz" instead of the number,--> i%3==0 -> Fizz
        //and for multiples of 5, print "Buzz",--> i%5==0 ->Buzz
        //for number multiples of both 3 and 5,print "FizzBuzz". --> i%3==0 && i%5==0 ->FizzBuzz
        // if both come this is the first condition



        //Coding->
        //1.User input
        //2.Rough code -> for loop 1 to 100, i%3==0 -> Fizz, i%5==0 ->Buzz, i%3==0 && i%5==0 ->FizzBuzz
        //3.Brute force
        //4.Logic correction

        for (int i = 1; i <= 100 ; i++) {
            if( i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else if (i%3==0 ){
                System.out.println("Fizz");
            }else if (i%5==0 ) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }



            }
        System.out.println("_ End of program _");
            
        }









    }

