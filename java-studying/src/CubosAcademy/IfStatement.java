package CubosAcademy;

public class IfStatement {
    public static void main(String[] args) {
    // test
        int number1 = 12,
            number2 = 15;

        if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
            System.out.println("without brackets");
        } else if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number1 + " is greater than " + number2);
        }
    }
}
