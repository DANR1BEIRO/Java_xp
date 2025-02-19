package Java_howToProgram;
/* The Scanner class is a built-in utility that allows you
to read input (from keyboard, files, etc.) in your program. */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);

        example(input); // Call the example method and pass the input object
        input.close(); // always close the Scanner once you're done

    }

    public static void example(Scanner input) {
        System.out.print("Enter a number: ");
        int number3 = input.nextInt();
        System.out.println("Your entered: " + number3);

    }

}

