package src.bacis_jan07_inheritance;

public class Java extends Programming {
    String newfeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String feature){
       this.newfeature=feature;
    }





    void printInfo(){
        System.out.println("Feature is ->" + this.newfeature);
    }

}
