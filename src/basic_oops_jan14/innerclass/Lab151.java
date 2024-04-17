package src.basic_oops_jan14.innerclass;

public class Lab151 {
    public static void main(String[] args) {

        Rashmi.Ipad pi = new Rashmi .Ipad();
        pi.eating();



    }
}

// Class Members
class Rashmi{
    int age  = 31; // Data Members / Instances Variables

    // Methods
    void eay(){
        System.out.println("I am eating");
    }

    static class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            //System.out.println(age);
        }
    }



}
