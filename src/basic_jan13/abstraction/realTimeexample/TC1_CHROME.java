package src.basic_jan13.abstraction.realTimeexample;

public class TC1_CHROME extends BaseClass{


    @Override
    String openBrawser() { //this is a concrete class
        System.out.println("Staring Chrome");
        return null;
    }

    @Override
    String closeBrawser() {
        System.out.println("Closing Chrome");
        return null;
    }
}
