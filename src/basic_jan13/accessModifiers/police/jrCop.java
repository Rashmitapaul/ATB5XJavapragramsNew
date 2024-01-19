package src.basic_jan13.accessModifiers.police;

public class jrCop {
    public static void main(String[] args) {
        Cop jc =new Cop(2);
        System.out.println(jc.gun);

        jc.canIShoot();//when you change protected this is  possible to used

    }
}
