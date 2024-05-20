package src.java_new_coding;

public class Test002 {
    public static void main(String[] args) {

      //  String str="Rashmita paul";
       // 0/p = Rashmita p
        //System.out.println("Rashmita p");
        String str = "Rashmita paul";
        int name= str.indexOf(' '); // Find the index of the first space character

        if (name != -1) { // Check if space exists in the string
            String result = str.substring(0, name + 2); // Extract substring up to spaceIndex + 1
            System.out.println(result); // Print the result
        } else {
            System.out.println(str); // If no space found, print the original string
        }

    }
}





