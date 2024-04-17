package src.basic_oops_jan14.wrapperclass;

public class Lab157 {
    public static void main(String[] args) {

        int x = 123;
        // String st1 = x;// 1 integer and 1 string is not possible
        //String st1 = (String)x;//down-casting is not possible
        String st1 = x+"";//concat is possible
        String s1 = String.valueOf(x);
        System.out.println(st1);
        System.out.println(s1);


    }
}
