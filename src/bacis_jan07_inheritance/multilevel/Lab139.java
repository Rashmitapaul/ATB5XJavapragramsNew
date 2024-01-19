package src.bacis_jan07_inheritance.multilevel;

public class Lab139 {
    public static void main(String[] args) {
       //multilevel inheritance
       // GrandFather g = new GrandFather();
      //  Father f = new Father();
       // Son s = new Son();
        GrandFather g = new Son();
        g.bhk3();

        Son s = new Son();
        s.bhk3();
        s.bhk2();
        s.bhk1();

    }
}
