package src.javaOOPSConceptCode.thiskeyword;

public class A {
    void show(){
        System.out.println(this);// create unique id "A@6acbcfc0"
    }
    public static void main(String[] args) {
        A r = new A();
        System.out.println(r);//both unique id "A@6acbcfc0" is same
        r.show();
    }
}
