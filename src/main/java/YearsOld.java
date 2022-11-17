import java.util.Calendar;
import java.util.Scanner;

public class YearsOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born?");
        int years = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        System.out.println("You are " + (calendar.get(Calendar.YEAR) - years) + " years old.");
    }
}
