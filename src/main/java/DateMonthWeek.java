import java.util.Scanner;

public class DateMonthWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day of the week is it today?");
        String week = scanner.nextLine();
        System.out.println("What is it today date?");
        String date = scanner.nextLine();
        System.out.println("What month is it?");
        String month = scanner.nextLine();
        int weekInt = 0;
        int monthInt = 0;

        switch (week) {
            case "Monday":
                weekInt = 1;
                break;
            case "Tuesday":
                weekInt = 2;
                break;
            case "Wednesday":
                weekInt = 3;
                break;
            case "Thursday":
                weekInt = 4;
                break;
            case "Friday":
                weekInt = 5;
                break;
            case "Saturday":
                weekInt = 6;
                break;
            case "Sunday":
                weekInt = 7;
                break;
        }
        switch (month) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
        }
        System.out.println("Today is " + weekInt + "." + date + "." + monthInt);
    }
}
