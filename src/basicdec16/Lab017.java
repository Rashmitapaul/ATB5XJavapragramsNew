package src.basicdec16;

public class Lab017 {
    public static void main(String[] args) {
        //Relational operators
        int age_rashmita = 30;
        int age_sibani = 34;
        boolean result = age_rashmita > age_sibani  ;
        System.out.println(result);

//>,<,>=,<=,==,!=
//  In case of int it check for value.
// In case of String it check for reference.


        int a1 = 10;
        int b1 = 10;
        boolean c1 = (a1 == b1);
        System.out.println(c1);

        int a2 = 10;
        int b2 = 10;
        boolean c2 = (a1 >= b1);// this is OR condition.
        System.out.println(c2);


    }
}
