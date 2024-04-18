package src.oops_21_jan_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab169 {
    public static void main(String[] args) {


    }

    static void readFile(String fileName) throws Exception {
        File f = new File(fileName);
        FileReader fileReader = new FileReader(fileName);//This is a check exception
        if (fileName.length() == 0) {
            throw new FileNotFoundException();
        }



    }
}
