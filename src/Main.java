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
    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviseOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.print("ios");
        } else {
            System.out.println("Android");
        }
    }
    private static boolean isDeviseOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }

    public static void main(String[] args) {
        System.out.println("Урок 12 Методы. Задача 1");
        int year = 2022;
        printIsLeapYear(year);
        System.out.println("Урок 12 Методы. Задача 2");
        int clientOS = 1;
        int deviceYear = 2022;
        int currentYear = LocalDate.now().getYear();
        recommendApplicationVersion(clientOS, deviceYear);
    }
}