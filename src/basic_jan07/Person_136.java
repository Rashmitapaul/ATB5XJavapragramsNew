package src.basic_jan07;

public class Person_136 {
    String name;


    Person_136(){
        System.out.println("DC");
    }
    Person_136(String ref_name){
        this.name = ref_name;
    }
//above all are constructor overloading
    void printDetails(){
        System.out.println("Your Name is ->" + this.name);
    }
//above void is a method overloading
}
