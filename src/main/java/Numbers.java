import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        System.out.println( number - 1 + " " + number + " " + (number + 1) + " " + (int)Math.pow(number * 3, 2));
    }
}