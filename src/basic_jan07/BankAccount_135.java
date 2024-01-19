package src.basic_jan07;

public class BankAccount_135 {
    String bankName;
    int balance;
    String bankCode;
    BankAccount_135(){
        bankName="SBI";
        bankCode="SBI001";
        System.out.println("Default constructor");
    }

    BankAccount_135(String bName, String bCode){
       this.bankName=bName;
        this.bankCode=bCode;

        System.out.println("Param constructor");
    }
    void printDetails(){
        System.out.println("Bank name ->" + this.bankName);
        System.out.println("Bank code ->" + this.bankCode);
        System.out.println("Balance ->" + balance);
    }

}
