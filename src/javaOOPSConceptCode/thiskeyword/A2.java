package src.javaOOPSConceptCode.thiskeyword;

public class A2 {
    //How to call default constructor using this keyword
    int a;
    A2(){
        System.out.println("Run coding");
    }
    A2(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        A2 r = new A2(12);

    }
}

