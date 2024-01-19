package src.bacis_jan07_inheritance.hierachical;

public class Vehicle {
    Vehicle(){
        System.out.println("DC vehicle");
    }
    void vehicleHasTopSpeed(){
        System.out.println("Yeah from" + getClass().getSimpleName());
    }
}
