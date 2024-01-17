package src.basic_oops_jan06;

public class Lab123 {
    public static void main(String[] args) {
        String s1 ="Rashmi";
        String s2 = new String("Rashmi");
        String s3= new String("rashmi");

        System.out.println(s1==s2);//o/p is false
        System.out.println(s1.equals(s2));//o/p is true
        System.out.println(s1.equals(s3));//o/p is false
        System.out.println(s1.equalsIgnoreCase(s3));//o/p is true



    }
}
