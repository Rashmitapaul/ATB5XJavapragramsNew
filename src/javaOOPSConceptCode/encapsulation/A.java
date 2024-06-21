package src.javaOOPSConceptCode.encapsulation;
//ENCAPSULATION EXAMPLE
 class A {
     private int value;//data hiding
     public void setValue(int x){
       value=x;//value=100
     }
     public int getValue(){
         return value;
         // return ++value;
     }
}
class B{
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}