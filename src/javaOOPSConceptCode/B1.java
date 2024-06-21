package src.javaOOPSConceptCode;
//Multiple inheritance using interface
interface B1 {
    void show();

}
interface  C1{
    void doc();

}
class multiples implements B1,C1
{
    public void show() {
        System.out.println("Interface B1 ");
    }

    public void doc() {
        System.out.println("Interface C1");
    }
    public static void main(String[] args) {
        multiples m1= new multiples();
        m1.show();

        m1.doc();

    }





}
