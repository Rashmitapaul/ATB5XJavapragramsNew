package src.collectionframework_3_feb_2024;

public class Lab200 {
    public static void main(String[] args) {
              //Generic
        // Java -> non generic ->
//
//        temp("Pramod");
//        temp(123);
//        temp(3.14);
//        temp(true);

        printFunc(3,4);

    }

    public static <T> void temp(T x) {
        System.out.println(x);
    }

    public static <T> void printFunc(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        // Proper logic compare the a and b
    }
}
