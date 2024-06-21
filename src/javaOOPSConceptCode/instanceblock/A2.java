package src.javaOOPSConceptCode.instanceblock;
//instance vs static block
public class A2 {
    //instance

    int a=10; static int b=23;
    {//instance block
        System.out.println(a+" "+b);

    }

   public static void main(String[] args) {
        A2 r = new A2();

    }
    //static block
    int a1=10; static int b1=23;
   static  {//static block and static block is only access for static variable.
        System.out.println("Learn coding");

    }

  //  public static void main(String[] args) {

    }
//}
