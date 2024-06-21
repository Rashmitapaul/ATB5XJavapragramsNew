package src.javaOOPSConceptCode;

public interface Customer {
    //Interface variable
    int amt=5;//amt variable by default public+ static + final always
     void purchase();//This method automatically public+ abstract always
}
class Seller implements Customer{


    @Override
    public void purchase() {
        //amt= 9;//you can't change this value because of final keyword
        System.out.println("Customer needs "+amt+"kg rice");
    }
}
class Check{
    public static void main(String[] args) {
        Customer r = new Seller();
        r.purchase();
       // System.out.println(Customer.amt);//Here prove variable is static
    }
}