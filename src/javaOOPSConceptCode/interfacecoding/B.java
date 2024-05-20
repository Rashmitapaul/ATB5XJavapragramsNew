package src.javaOOPSConceptCode.interfacecoding;
//Multiple inheritance using interface
 interface B {
    void doc();

}
interface  C{
     void doc();

}
class multiple implements B,C
{

    public void doc() {
        System.out.println("Interface B & C");
    }
    public static void main(String[] args) {
        multiple m= new multiple();
        m.doc();

    }





}