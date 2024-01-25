package src.basic_jan13.abstraction.realTimeexample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrawser() {
        System.out.println("Staring Firefox");
        return null;
    }

    @Override
    String closeBrawser() {
        System.out.println("Closing Firefox");
        return null;
    }
}
