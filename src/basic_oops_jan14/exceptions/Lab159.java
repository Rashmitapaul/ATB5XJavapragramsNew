package src.basic_oops_jan14.exceptions;

public class Lab159 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim(); // 100GB used! stackovererror
            System.out.println("I am Pramod");
      }catch (Exception e){
        System.out.println("You are trying to trim a null string that is not possible in java!!");
       }
        System.out.println("Hi I am the End");

    }
}

// Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow 
