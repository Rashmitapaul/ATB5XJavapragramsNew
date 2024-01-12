package src.basic_oops_dec30;

public class Lab107 {
    public static void main(String[] rashmita) {//Here i am change the argument.It is just only reference name
        System.out.println("Run fine!!");

        //call this function
       int d=  main(10);
        System.out.println(d);
        main("Rashmita");
    }
   static void main (String a){
        System.out.println("I am a main function but JVM doesn't recognize me");
    }
     static int main (int a){
        return a+102;
    }
}
