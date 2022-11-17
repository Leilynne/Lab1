import java.util.Scanner;

public class AgeName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        String ages = scanner.nextLine();

        System.out.println("Your name is " + name + ". You age " + ages + " years old.");


    }
}
