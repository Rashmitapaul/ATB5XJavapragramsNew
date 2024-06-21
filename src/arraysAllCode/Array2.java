package src.arraysAllCode;
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
//        Enter a number:5
//        Enter a number:3
//        Enter a number:8
//        Enter a number:2
//        Enter a number-1
//
//        The highest number is 8
//        The lowest number is 2

        Scanner scanner = new Scanner(System.in);

// create an array to store the numbers
        int[] numbers = new int[100];
        int size = 0;

// read the numbers from the user
        int n;
        do {
            System.out.print("Enter a number: , -1to stop entering");
            n = scanner.nextInt();
            if (n >= 0) {
                numbers[size] = n;
                size++;
            }
        } while (n >= 0);

// find the highest and lowest numbers
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            }

// print the highest and lowest numbers


            System.out.println("The highest number is " + highest);
            System.out.println("The lowest number is " + lowest);

    }
}

