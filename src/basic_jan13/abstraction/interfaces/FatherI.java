package src.basic_jan13.abstraction.interfaces;

interface FatherI {
    void loan1k();


    default void print(){
        System.out.println("I am default method");
    }
    static void print1(){
        System.out.println("I am static method");

    }
}
