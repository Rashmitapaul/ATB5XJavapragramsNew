package src.corejavanewcode;

public class Wrapper {

    public static void main(String[] args) {
        //Wrapper class
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer i1 = Integer.valueOf("10110",2);
        int y = i1.intValue();
        System.out.println(y);

        Double  x1=Double.valueOf("56");
        double y1 = x1.doubleValue();
        System.out.println(y1);


    }
}
