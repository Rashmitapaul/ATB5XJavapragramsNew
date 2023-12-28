package src.basicdec16;

public class Lab033 {
    public static void main(String[] args) {
        //Ternary operator--> It is based on conditions.
        //int a = condition ? if this is  true print do this : if false do this.
        // Max in two number
        int a = 40;
        int b= 20;
        int c = 32;
        // a>b  && a>c ->
        //a>c ? a:c
        //b>c ? b:c

        int max = (a>b) ? ((a>c )? a:c) : ((b>c )? b : c);
        System.out.println(max);






    }
}
