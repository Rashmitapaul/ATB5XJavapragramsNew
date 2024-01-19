package src.bacis_jan07_inheritance;

public class Programming {
int version;
    String author;

Programming(){
    System.out.println(" Programming - DC");

}

    Programming(String author , int verson){
    this.author = author;
    this.version =version;

    }

    void printInfo(){
        System.out.println("Program info -> " + this.version + " Author " + this.author);
    }
    void car(){
        System.out.println("Lambo");
    }
    void bhk3(){
        System.out.println("3BHK");
    }
}
