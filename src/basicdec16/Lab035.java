package src.basicdec16;

public class Lab035 {
    public static void main(String[] args) {
        //  Increment operator
        int a = 10;
        System.out.println(++a +  a++ + a++);
        System.out.println(a);

        //Part- A (Expression =11,a=11)--> ++a --> o/p--> 11
        //Part- B (Expression =11,a=12)--> ++a --> o/p--> 11
        //Part - C (Expression =12,a=13)--> ++a --> o/p--> 12
        // total = A+B+C--> 11+11+12=34, a -->13
        int b = 10;
        System.out.println(++b + b++);
        System.out.println(b);
        //Part- A (Expression =11,b=11)--> ++b --> o/p--> 11
        //Part- B (Expression =11,b=12)--> ++b --> o/p--> 12
        // total = A+B--> 11+11=22, b-->12


    }
}
