package CubosAcademy;

public class SwitchCase {
    public static void main(String[] args) {

        int number1 = 18,
            number2 = 48;


        switch (number1) {
            case 15, 16, 17, 18:
                System.out.println("Number between 15 and 18");
                break;
            case 14:
                System.out.println("number 14");
                break;
            default:
                System.out.println("Unknown number");
                break;

        }

        switch (number2) {
            case 48, 49, 50, 51, 52 -> System.out.println("Number between 48 and 52");
            case 70 -> System.out.println("Number 70");
            default -> System.out.println("Unknown number");
        }

        String age = (number1 <- 17) ? "minor":"adult";
        int ageInt = (number1 <- 17) ? 1:2;

        System.out.println(age);
        System.out.println(ageInt);
    }
}
