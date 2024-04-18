package src.oops_21_jan_2024;

public class Lab173 {
    public static void main(String[] args) throws CustomException {


        Bank jpchase = new Bank("USD", 100);

        Bank hdfc = new Bank("INR", 100);
        Bank icici = new Bank("INR",100);

        System.out.println(hdfc.add(jpchase));//In this case we got Custom Exception
        //System.out.println(hdfc.add(icici));
        // Custom Exception



    }
}
