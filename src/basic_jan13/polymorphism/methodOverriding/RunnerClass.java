package src.basic_jan13.polymorphism.methodOverriding;

public class RunnerClass {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.bark();

      Rambo r= new Rambo();
      r.bark();

        Dog d1 = new Rambo();//This is called as dynamic dispatch or runtime polymorphism
        d1.bark();
    }
}
