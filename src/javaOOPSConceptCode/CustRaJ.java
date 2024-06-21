package src.javaOOPSConceptCode;
//Extend interface
public interface CustRaJ {
    void add();

}
interface CustomerRohit extends CustRaJ{
    void sub();
}
class DevAnkit implements CustomerRohit{

    @Override
    public void add() {
        int a=29;int b=10;
        int c=a+b;
        System.out.println("Addition " + c);
    }

    //@Override
    public void sub() {
       int a=29;int b=10;
      int c=a-b;
       System.out.println("Substraction " + c);
   }
    }
class Main{
    public static void main(String[] args) {
        CustomerRohit d1= new DevAnkit();
        d1.add();
        d1.sub();
    }
}