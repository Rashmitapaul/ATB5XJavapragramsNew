package src.basic_oops_jan06;

public class Lab124 {
    public static void main(String[] args) {

        //Immutable in nature ->That can't be change
        String s1 ="Rashmi";
        String s2 = new String("Rashmi");

        //Mutable in nature -> That can be change
        StringBuffer sb3=new StringBuffer("Hello");
        sb3.append("World");
        System.out.println(sb3);


        StringBuilder sbl4= new StringBuilder("Rashmi");
        sbl4.append("Paul");
        System.out.println(sbl4);
    }
}
