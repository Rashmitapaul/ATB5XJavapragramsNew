package src.basicdec16;

public class Lab025 {
    public static void main(String[] args) {
        String s1 = "Rashmita";
        // string constant pool ---> scp/ string pool
        //New operator - object
        String s2 = new String("Rashmita");
        //new operator is used to create the new object for class.
        // It returns of the address newly created object.
        System.out.println(s2);
        System.out.println(new String("Rashmita"));
        //Both are different
    }
}
