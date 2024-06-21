package src.javaOOPSConceptCode.wrapperclass;
//Unboxing
public class UnBoxing {
    public static void main(String[] args) {
        Integer a1 = new Integer(12);
        int b=a1;//Unboxing
        Integer c=a1.intValue();//unboxing
        System.out.println(a1+" "+b+" "+c);
    }
}