package src.basic_jan13.abstraction.interfaces;

public class RashmiC implements FatherI{
    @Override
    public void loan1k() {
        FatherI.print1();
        System.out.println("I will give you loan");
    }
}
