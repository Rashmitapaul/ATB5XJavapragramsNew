package src.basic_oops_dec30;

public class Lab101 {
    public static void main(String[] args) {
        // Functions
        int c = rashmi_sum();// no argument
        int c1 = rashmi_sum(3);// one argument
        int c2 = rashmi_sum(3, 4);// two argument
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);


    }

    //Unlimited function we can create in same name
    static int rashmi_sum(int input_1, int input_2) {
        return input_1 + input_2;

    }

    static int rashmi_sum(int input_1) {
        return input_1;

    }

    static int rashmi_sum() {
        return 99;

    }

    static int rashmi_sum(int input_1, int input_2, int c) {
        return input_1 + input_2 + c;

    }
}