package src.oops_21_jan_2024;

public class Lab168 {
    public static void main(String[] args) throws Exception {
        // extracted(10);
        extracted(0);
        throw new Exception("Hello");
    }

    private static void extracted(int b) {
//      other method1
//        int a;
//        if (b == 0) {
//            throw new ArithmeticException("B can't be zero");//in this case jvm not given the exception
//        }else{
//            a = 10 / b;
//        }
//        System.out.println(a);


        // wEB AUT  a ==0 -> throw exception and exit the program



  /// other method2
//        try {
//            int a = 10 / b;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
