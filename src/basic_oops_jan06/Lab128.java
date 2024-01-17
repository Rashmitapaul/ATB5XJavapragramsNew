package src.basic_oops_jan06;

public class Lab128 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Beauty");//This is not palindrome
        sb.reverse();
        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder("naman");//This is palindrome
        sb1.reverse();
        System.out.println(sb1);
    }
}
