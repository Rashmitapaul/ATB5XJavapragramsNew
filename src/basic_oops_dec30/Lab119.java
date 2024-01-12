package src.basic_oops_dec30;

public class Lab119 {
    public static void main(String[] args) {
        //This is the  more simple process for reverse in Lab118
        String name ="Rashmi";
        String y ="";
        for (int i = name.length()-1; i >= 0 ; i--) {
            y = y + name.charAt(i);

        }

        System.out.println(y);
    }
}
