package src.oops_21_jan_2024;

public class Hello {
    public static void main(String[] args) throws Exception {
        H h = new H();
        h.process();
    }
}

class H{
   // public int process() throws Exception {

    //   throw new NullPointerException();
   // }
    //case2
    //public int process() throws Exception {//in this case ArithmeticException come
      // int a =10/0;
       // throw new NullPointerException();

   // }
    //case3
    public int process() throws Exception {//in this case ArithmeticException come
        int a =10/0;
        return 0;


    }

}
