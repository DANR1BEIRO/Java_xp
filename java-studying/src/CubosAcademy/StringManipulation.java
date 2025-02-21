package CubosAcademy;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Yes or No (Y/N): ");
        String choose = input.next().toUpperCase();

        String name = "Goku";
        double number = 13.5;
        String numberStr = String.valueOf(number);

        System.out.println(numberStr.charAt(1));

        // startsWith is case sensitive
        if (choose.startsWith("Y", 0)) {
            System.out.println("Choose Yes");

        } else {
            System.out.println("Choose No");
        }

        if (name.endsWith("u")) {
            System.out.println("Ends with u");
        } else {
            System.out.println("Don't end with u");
        }
    }
}
