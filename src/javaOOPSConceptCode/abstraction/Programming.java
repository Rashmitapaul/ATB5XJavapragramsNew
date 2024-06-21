package src.javaOOPSConceptCode.abstraction;

abstract class Programming {//super class
    public abstract void Developer();


}
class  HTML extends Programming{
     @Override
    public void Developer(){
        System.out.println("Sanjay kumar Sahoo");
    }


}
 class Java extends Programming{
    @Override
    public void Developer(){
        System.out.println("Beauty paul");
    }
}
class Main{
    public static void main(String[] args) {
        HTML h = new HTML();
        h.Developer();
        Java j = new Java();
        j.Developer();

    }
}