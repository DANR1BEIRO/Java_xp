package Exercises;

/*
Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division)
*/

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first integer: ");
        int a = input.nextInt();

        System.out.print("Enter the second integer: ");
        int b = input.nextInt();

        System.out.println("The sum is: " + (a+b));
        System.out.println("The product is: " + (a*b));
        System.out.println("The difference is: " + (a-b));

        if (b != 0)
            System.out.println("The quotient is: " + (a/b));
        else
            System.out.println("Error: Division by zero isn't allowed");

        input.close();

    }
}
