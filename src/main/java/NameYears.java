import java.util.Calendar;
import java.util.Scanner;

public class NameYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What year were you born?");
        int years = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Your name is " + name + ". " + "You are " +
                (calendar.get(Calendar.YEAR) - years) + " years old.");
    }
}
