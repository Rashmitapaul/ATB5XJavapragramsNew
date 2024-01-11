package src.basicdec24;

public class Lab088 {
    public static void main(String[] args) {
        int [] marks_10={90,87,65,45,89};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
        System.out.println(marks_10[4]);
        //System.out.println(marks_10[5]);//Exception in thread

        int[] a= new int[4];
       // a ->[0,0,0,0,] -> this is the default value of int->0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0]=76;
        System.out.println(a[0]);
        a[1]=86;

        System.out.println(a[5]);//java.lang.ArrayIndexOutOfBoundsException

       final int[] b= new int[4];//important
       // b ->[0,0,0,0,]
        b[0]=76;
        System.out.println(b[0]);






    }
}
