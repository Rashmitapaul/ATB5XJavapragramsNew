package src.basicdec23;

public class Lab074 {
    public static void main(String[] args) {
        //continue
        for (int i = 0; i <= 10; i++) {
            if(i % 2==0){
                System.out.println("Value Even of ->"+ i);
                continue;
            }
            System.out.println("Value Odd of ->"+ i);
        }
    }
}
