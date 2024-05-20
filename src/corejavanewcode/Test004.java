package src.corejavanewcode;
class Rashmi{
    int x;//Instance(object) member variable
    int y;//Instance(object) member variable

    void fun1(){//Instance(object) member function
        System.out.println("BPD");
    }
    void fun2(){//Instance(object) member function
        System.out.println("BLS");
    }

}

public class Test004 {


        public static void main(String[] args) {
           Rashmi r1= new Rashmi();
            Rashmi r2= new Rashmi();

           r1.x=5;

            System.out.println(r1.x);
            System.out.println(r1.y);


        }
}
