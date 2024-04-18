package src.oops_21_jan_2024;

import java.io.File;
import java.io.FileReader;

public class Lab172 {
    public static void main(String[] args) {
        int a = 10/0; //Example of UnChecked - JVM don't know?
        //Example of Checked
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
