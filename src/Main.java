import static java.time.Year.isLeap;
import java.time.LocalDate;

public class Main {
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap (year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean isLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printIsLeapYearResult(int year, boolean yearIsLeap){
        if (yearIsLeap) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " - не является високосным годом");
        }
    }
    public static void main(String[] args) {
        System.out.println("Урок 12 Методы. Задача 1");
        int year = 2022;
        printIsLeapYear(year);

    }
}