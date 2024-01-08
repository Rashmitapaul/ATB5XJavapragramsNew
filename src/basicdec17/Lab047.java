package src.basicdec17;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        //Triangle Classifier

        //Write a program that classifies a triangle based on its side length
        //Given three input values representing the length of the sides,determine
        //Side 1,side 2, side 3-->side 1 == side 2 == side 3 -->Equilateral
        //side 1 == side 2 or side 2 == side 3 -->Isosceles
        //scalene(no side are equal)
        //Use an if else statement to classify the triangle


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2, side3, I will tell about the triangle ");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();
        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Equilateral Triangle");
        }else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Isosceles Triangle ");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
