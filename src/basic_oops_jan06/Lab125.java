package src.basic_oops_jan06;

public class Lab125 {
    public static void main(String[] args) {
        //Immutable in nature ->That can't be change
        String password ="Rashmi@123";

//  1000 time I am going to change the password value
        //Should use StringBuffer or StringBuilder .
        //Mutable in nature -> That can be change
        StringBuffer password2=new StringBuffer("Hello");
        password2.append("World");
        System.out.println(password2);


        StringBuilder password3= new StringBuilder("Rashmi");
        password3.append("Paul");
        System.out.println(password3);
    }
}
