package src.basic_oops_jan06;

public class Lab121 {
    public static void main(String[] args) {


        String name = "Rashmi";//string constant pool
        String name2 = new String("Rashmi");//Heap area


        String str1 = "Hello";
        str1= str1.concat("world");
        System.out.println(str1);
        //if another string created
        String str2 ="Hello";
    }
}
