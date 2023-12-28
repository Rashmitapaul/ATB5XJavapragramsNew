package src.basicdec16;

public class Lab016 {
    public static void main(String[] args) {
        // simple arithmetic operator
        //byte a = 10;
       // byte b = 18;
       // System.out.println(a+b);

        int a = 10;
        int b = 32;
        //Compound assignment operator
        //Example is +=,-=,/=,*=.%=
        b +=30;//b= b + 30
        System.out.println(b);
        int b2 = 90;
        b2 -=89;//b2=b2-90
        System.out.println(b2);
        b2 = b2+1;//this is not a Compound assignment operator

    }
}
