package src.basic_oops_dec30;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println(sc.next());
    }
//This is called a method over loading.
    public static void main(int a) {
        System.out.println("Another main");
    }

    public static int main(int a,int c,int d) {
        return 99;
    }
    public static void main(int a, int b) {
        System.out.println("Another main");
    }

}
