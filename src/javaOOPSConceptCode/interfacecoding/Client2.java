package src.javaOOPSConceptCode.interfacecoding;
//Interface method
public interface Client2 {
    void webdesign();
    void webdevelopment();

}
 abstract class RajTech implements Client2{


    @Override
    public void webdesign() {
        System.out.println("Green, top menu three dot");

    }
}
class RashmiTech extends RajTech{

    @Override
    public void webdevelopment() {
        System.out.println("HTML,CSS,JAVASCRIPT");
    }
}
class Check2{
    public static void main(String[] args) {
        RashmiTech r1 = new RashmiTech();
        r1.webdesign();
        r1.webdevelopment();
    }
}