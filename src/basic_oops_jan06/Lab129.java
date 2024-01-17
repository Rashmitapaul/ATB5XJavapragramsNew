package src.basic_oops_jan06;

import java.util.Locale;
import java.util.Scanner;

public class Lab129 {
    public static void main(String[] args) {
        //palindrome program
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String, I will check the palindrome");
        String user_input =  sc.next();
       // user_input= user_input.toLowerCase();
        boolean result = isPalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
        

    }

     static boolean isPalindrome(String userInput) {
        String original_str = userInput;//Rashmi,naman
        StringBuilder sb= new StringBuilder();
        String reverse_string =sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);


    }
}
