package src.basic_jan13.abstraction.interfaces.realTimeExample;

public class CarRun extends Car {
    public static void main(String[] args) {
        CarRun c = new CarRun();//in this case engine and break mechanism is hidden.
        c.start();
    }
}