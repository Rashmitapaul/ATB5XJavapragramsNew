package src.arraysAllCode;

public class Array1 {
    public static void main(String[] args) {
        //Different way to print arrays elements
//        int a[] = new int[3];
//        a[0]=12;
//        a[1]=22;
//        a[2]=34;
//        for (int i = 0; i < 3; i++) {
//            System.out.println(a[i]+ " ");
//        }

      //  way2
        int a[] = new int[3];
        a[0]=12;
        a[1]=22;
        a[2]=34;
        for (int b: a) {//for each loop
            System.out.println(b + " ");
        }
    }
}

