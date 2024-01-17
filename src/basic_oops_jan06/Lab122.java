package src.basic_oops_jan06;

public class Lab122 {
    public static void main(String[] args) {
        String name = "Rashmi";
        System.out.println(name.concat (" Paul "));
        System.out.println (name + " Paul ");
        System.out.println(name.contains("l"));
        System.out.println(name);

        String name2 = new String("Paul");



        String expected_resul ="rashmi@123";
        String actual_resul = "Rashmi@123";

        if (expected_resul.equalsIgnoreCase(actual_resul)){
            System.out.println("Yes");
        }

    }
}
