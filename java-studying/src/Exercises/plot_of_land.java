/*
Create a program to read the width and length of a rectangular
plot of land, each with one decimal place, as well as the price
per square meter of the plot with two decimal places. Then,
the program should display the plot's area and the total price
of the plot, both with two decimal places, according to with the example:

input:
width: 10.0
length: 30.0
price per meter: $200.00

Output:
area = 300.00m²
price = $60000.00
*/



package Exercises;

import java.util.Scanner;

public class plot_of_land {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        double area = width * length;
        double price = area * 200;

        System.out.printf("Area: %.2fm² \nPrice: $%.2f", area, price);

        input.close();
    }
}
