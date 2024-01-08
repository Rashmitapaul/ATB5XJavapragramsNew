package src.basicdec17;

public class Lab054 {
    public static void main(String[] args) {
        //jdk >13
        //This is also advance switch loop
        int itemcode= 005;
        switch (itemcode){

            case 001-> System.out.println("It is a laptop!");
            case 002-> System.out.println("It is a desktop !");
            case 003,004-> System.out.println("It is a mobile phone !");
            default-> System.out.println("It is a software product!");

        }
    }
}
