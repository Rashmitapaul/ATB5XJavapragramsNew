package src.javaOOPSConceptCode.thiskeyword;

public class A1 {
   int a;
        A1(int a){
           // a=a; o/p come 0
            this.a=a;//When you write this. keyword then o/p come 12
        }
        void show(){
            System.out.println(a);
        }
        public static void main(String[] args) {
            A1 r = new A1(12);
            r.show();
        }
    }
