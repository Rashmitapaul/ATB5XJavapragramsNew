package src.basic_jan13;

public class BlockClass {
    //Instance Initialization block
    {
        System.out.println("I am IIB");
    }
BlockClass(){
    System.out.println("I am DC");
}

static {//Static initialization block
    System.out.println("I am SIB");

}
}
