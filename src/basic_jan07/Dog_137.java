package src.basic_jan07;

public class Dog_137 {
    String name;//Instance variable

    Dog_137(){
        System.out.println("DC");
    }
    Dog_137(String nameref){
        this.name= nameref;
        System.out.println("DC");
    }
    void bark(){
        int age = 10;
        System.out.println("Bark");
        System.out.println("Dog name is ->" + this.name);
    }
}
