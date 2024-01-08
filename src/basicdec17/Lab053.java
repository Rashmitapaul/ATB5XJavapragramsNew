package src.basicdec17;

public class Lab053 {
    public static void main(String[] args) {
        //JDK 13
        //This is advance switch
        int itemcode= 002;
        switch (itemcode){

            case 001,002,003:
                System.out.println("It is an electronic gadget!");
            case 004,005:
                System.out.println("It is a mechanical device !");
            default:
                System.out.println("It is a software product!");

        }
    }
}
