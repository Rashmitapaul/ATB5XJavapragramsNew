package src.basic_oops_jan14.interviewQ;

public class Interface1 {
    public static void main(String[] args) {
        System.out.println(H.a);

    }
}
interface H {
    //Only static variable

    int a = 20;//variable are static
    int b = 40;//variable are static
    void m1();//Function are nonstatic
}

class Rashmi implements H{

    @Override
    public void m1() {

    }
}