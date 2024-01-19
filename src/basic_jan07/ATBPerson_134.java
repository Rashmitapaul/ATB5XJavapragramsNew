package src.basic_jan07;

public class ATBPerson_134 {
    //instance variable value are default value
    String name;
    long phoneNumber;
    String emailId;
    int age;
    boolean ismarried;

    ATBPerson_134(){// This is called as default constructor
        name="Rashmi";
        System.out.println("I am Default");
    }

    ATBPerson_134(String valuefromobjectref){// This is called as parameter  constructor
       this.name =valuefromobjectref;

    }
    void talk(){
        System.out.println("Talk");
    }

    void printDetails(){
        System.out.println(this.name);

       // System.out.println(name);
       // System.out.println(phoneNumber);
       // System.out.println(emailId);
       // System.out.println(age);
       // System.out.println(ismarried);
    }
}
