package src.basic_oops_jan06;

public class Lab120 {
    public static void main(String[] args) {
        String name = "Rashmi";//string constant pool
        String name2 = new String( "Rashmi");//Heap area
       name = "Paul";



        String str1 ="Hello";
        String str2 =str1.concat("world");
        String str3 ="world";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
//or
       // String str1 ="Hello";
       // str1.concat("Rashmi");
       // System.out.println(str1);//o/p is  still hello

    }
}
