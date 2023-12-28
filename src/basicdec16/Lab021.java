package src.basicdec16;

public class Lab021 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a>10 || a<5;
        System.out.println(b);
        boolean b2 = !(a>10 || a<5);// return
        System.out.println(b2);
        int a1 = 67;
        boolean b3 = (a1 > 20 || a1 < 78);
        System.out.println(b3);
        boolean b4 = !(a1 > 20 || a1 < 78);
        System.out.println(b4);

        boolean b5 = !(a1 > 20 && a1 < 78);
        System.out.println(b5);






    }
}
