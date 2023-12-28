package src.basicdec16;

public class Lab023 {
    public static void main(String[] args) {
        // Casting --> this is also known as mold
        //Widening is the process of converting lower type to higher
        byte b = 10;
        int a = b;// Implicit casting--> done by JVM
//int a = (int) b;// Explicit casting--> done by JVM

// Narrowing is the process of converting higher type to lower.
        int a1 = 300;
        //byte b1 = a1;//invalid Implicit casting
        byte b1 = (byte)a1;// Explicit casting
        System.out.println(b1);




    }
}
