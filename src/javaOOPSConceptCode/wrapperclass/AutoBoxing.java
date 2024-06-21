package src.javaOOPSConceptCode.wrapperclass;
//Autoboxing
public class AutoBoxing {
    public static void main(String[] args) {
        int a= 10;
        Integer b=a;//Autoboxing
        Integer c=Integer.valueOf(a);//Autoboxing
        System.out.println(a+" "+b+" "+c);
    }
}
