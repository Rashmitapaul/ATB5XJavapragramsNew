package src.basic_oops_jan06;

public class Lab127 {
    public static void main(String[] args) {
        //If something is Thread safe we avoid -> StringBuffer.
        //Mostly used String Builder.


        StringBuilder sb = new StringBuilder("Beauty");
        sb.reverse();
        System.out.println(sb);
    }
}
