import java.util.Calendar;
import java.util.Scanner;


public class YearsBorn {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How old are you?");
            int years = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            System.out.println("You were born in " + (calendar.get(Calendar.YEAR) - years));
        }
}

