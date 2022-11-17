import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your lastname:");
        String lastName = scanner.nextLine();
        System.out.println("Your name:");
        String name = scanner.nextLine();
        System.out.println("Your surname:");
        String surname = scanner.nextLine();
        System.out.println("Hello, " + lastName + " " + name + " " + surname + ".");
    }
}
