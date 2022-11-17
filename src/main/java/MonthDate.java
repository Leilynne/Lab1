import java.util.Scanner;

public class MonthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What month is it now?");
        String month = scanner.nextLine();
        System.out.println("How many days in a month?");
        String days = scanner.nextLine();
        System.out.println("There are " + days + " in "+ month);

    }
}
