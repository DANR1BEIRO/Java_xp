import java.util.Scanner;

public class dataInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;

        System.out.printf("The sum of %f and %f is %.2f", number1, number2, sum);

        input.close();
    }



}
