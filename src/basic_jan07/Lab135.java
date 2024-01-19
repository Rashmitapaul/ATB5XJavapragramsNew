package src.basic_jan07;

public class Lab135 {
    public static void main(String[] args) {
        BankAccount_135 sbi = new BankAccount_135();
        sbi.printDetails();//default con

        System.out.println("- -");

        BankAccount_135 hdfc = new BankAccount_135("HDFC" , "hdfc001");
        hdfc.printDetails();//param co

        System.out.println("- -");


        BankAccount_135 icici = new BankAccount_135("ICICI", "icici002");
        icici.bankCode="icici0005";
        icici.printDetails();//param co

    }
}
