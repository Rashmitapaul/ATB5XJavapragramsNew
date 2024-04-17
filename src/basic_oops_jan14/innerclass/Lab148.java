package src.basic_oops_jan14.innerclass;

public class Lab148 {
}
class Outerclass{
    int a = 10;//Instance variable

}
class InnerClass{
    int b = 10;//Instance variable
    void m2(){
       // System.out.println(a);//outerclass can't access the inner thing
    }
}