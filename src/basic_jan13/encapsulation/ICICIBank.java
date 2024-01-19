package src.basic_jan13.encapsulation;

public class ICICIBank {
    public String getName() {
        return name;
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal > 0) {//here you restrict variable by using encapsulation.
            this.bal = bal;
        } else {
            System.out.println("Not allowed");
        }
    }
    String name;
    long bal;

}
