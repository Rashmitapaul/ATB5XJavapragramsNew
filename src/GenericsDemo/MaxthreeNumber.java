package src.GenericsDemo;

public class MaxthreeNumber {
    public static void main(String[] args) {
        //34,54,72
        //4.3 , 2.9,1.2
        //p, q z
        int maxput = maximumNumberOf(34,54,72);
        //double maxput = maximumNumberOf(4.3,5.4,1.2);
        //String maxput =maximumNumberOf(p, q ,z)

        System.out.println(maxput);

    }
    public static int maximumNumberOf(int a, int b ,int c) {
    int max = a;
   if (b > max) {
        max = b;
    }
    if(c> max){
        max=c;
    }
   return max;


//public static double maximumNumberOf(double a, double b ,double c) {
//    double max = a;
//    if (b > max) {
//        max = b;
//    }
//    if(c> max){
//        max=c;
//    }
//    return max;
//

}
}
