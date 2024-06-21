package src.javaOOPSConceptCode;

import java.util.Scanner;

public interface Client {
    void input();//It is by-default public and abstract
    void output();//It is by-default public and abstract
}
class Developer implements Client{
    String name;double salary;
   public void input(){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter user name :");
        name= s.nextLine();

        System.out.println("Enter user salary :");
        salary= s.nextDouble();
    }
   public void output(){
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();
    }
}