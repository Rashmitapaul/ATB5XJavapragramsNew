package src.basic_oops_jan14.exceptions;

public class Lab166 {
    // Thorws and customeExcpetipon// Learn in the NExt Class
    // 1 Lecture - Multi Threading self paced - This week


    public static void main(String[] args) {
        extracted2();
    }



    private static void extracted2() {
        extracted1();
        System.out.println("extracted2 Execute");
    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted1 Execute");
    }

    private static void extracted() {

            String name = null;
            name.length();//here we get a error



        }
    }

