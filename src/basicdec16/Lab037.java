package src.basicdec16;

public class Lab037 {
    public static void main(String[] args) {
        //Decrement operator
        int b = 10;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
        //Part- A (Expression =9,b=9)--> --b --> o/p--> 9
        // Part - B (Expression =9,b=10)--> b++ --> o/p--> 10
        //Part- C (Expression =9,b=9)--> b-- --> o/p--> 9
        // total = A+B+C --> 9+9+9=27, b -->9

        int c = 10;
        System.out.println(--c + c++ + ++c);
        System.out.println(c);
        //Part- A (Expression =9,c=9)--> --c --> o/p--> 9
        // Part - B (Expression =9,c=10)--> c++ --> o/p--> 10
        //Part- C (Expression =11,c=11)--> ++c --> o/p--> 11
        // total = A+B+C --> 9+9+11=29, c -->11


    }
}
