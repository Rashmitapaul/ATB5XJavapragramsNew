package src.basicdec23;

public class Lab071 {
    public static void main(String[] args) {
        // Very Importance
       // int a= 10;
              //  if(a==10){//if condition doesn't have break
               //     break;
               // }
        for (int i = 0; i < 10; i++) {// It is valid syntax
            System.out.println(i);
            if(i%2==0) {
                break;
            }
        }
    }
}
