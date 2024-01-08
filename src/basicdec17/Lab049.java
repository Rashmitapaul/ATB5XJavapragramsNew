package src.basicdec17;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name chrome,firefox,edge,opera");
        //1->Monday 7->Sunday
        String browser = sc.nextLine();
      //  String browser =user_input.toLowerCase() ;//other option

        switch (browser){

            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            case "opera":
                System.out.println("Execute the opera code");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }

    }

}
