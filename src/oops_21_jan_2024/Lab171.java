package src.oops_21_jan_2024;

import java.io.File;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws Exception {
        main("Pramod");
    }

    static void main(String a) throws Exception{

        // Code 100

        //101
        FileReader f = new FileReader(new File("C://a/txt"));

        if(a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }

        // Code 100
    }
}
