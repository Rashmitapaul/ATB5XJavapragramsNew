package src.javaOOPSConceptCode.polymorphism;
//Method overriding
public class Shape {//super class
    void drow(){
       System.out.println("can't say shape type");
   }
}
class Square extends Shape{//square is a sub class
    @Override
    void drow(){
        //super.drow();//if you write super.method name den you can call both class
        System.out.println("Square shape");
    }

}
class Demo{
    public static void main(String[] args) {
        Shape s1 = new Square();
        s1.drow();
    }
}