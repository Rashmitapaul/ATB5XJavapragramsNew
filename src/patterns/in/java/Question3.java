package src.patterns.in.java;

public class Question3 {
    //            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
//            9 8 7 6 5 4 3 2 1 0
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            //System.out.println(i);
            for (int j = 0; j < 10; j++) {

                System.out.print(9-j + " ");

            }
            System.out.println();
        }

    }
}

