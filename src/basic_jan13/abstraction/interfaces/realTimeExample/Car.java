package src.basic_jan13.abstraction.interfaces.realTimeExample;

public class Car implements Engine, Break{
    void start(){
        System.out.println("Starting a Car");
         startEngine();
         breaks();

    }


    @Override
    public void startEngine() {
        System.out.println("Started Engine");
    }



    @Override
    public void breaks() {
        System.out.println("BREAK IS WORKING FINE");
    }
}
