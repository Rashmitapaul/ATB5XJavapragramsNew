package src.basic_oops_jan06;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {

        String name ="Rashmi";
        String y ="";
        for (int i = name.length()-1; i >= 0 ; i--) {
            y = y + name.charAt(i);

        }
        System.out.println(y);

    }

}
