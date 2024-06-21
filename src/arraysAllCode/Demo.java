package src.arraysAllCode;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
       // int a[]={10,20,30,40,50};// start 0 to 4
      //  System.out.println(a[3]);
        //static aaray
        int b[]= new int[5];//static aaray size is always fix
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);

        }
        //Dynamic Array
        int size;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of array");
        size=r.nextInt();
        int a[]= new int [size];
        for (int i = 0; i < size; i++) {
            a[i]=r.nextInt();

        }
        System.out.println("Print array elements");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]+ " ");//enter the size

        }

    }
}
