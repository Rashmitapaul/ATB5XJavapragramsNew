package src.basic_oops_jan14.exceptions;

public class Lab163 {
    public static void main(String[] args) {
        //Another way to handle the try catch but this is not good,use lab162 code always
        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }


        try {
            String ip = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
