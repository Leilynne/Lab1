import java.util.Scanner;

public class SumAndSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of the numbers is: " + (firstNumber + secondNumber) + ". Difference between numbers: " +
                (firstNumber - secondNumber));
    }
}