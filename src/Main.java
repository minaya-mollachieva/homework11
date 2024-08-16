import java.time.LocalDate;

public class Main {
    // Задача 1
    public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(2103);
        isLeapYear(2024);

       checkOS (0, 2000 );
        checkOS (1, 2024 );

        int distance = calculateTime(50);
        System.out.println("Потребуется дней для доставки: " + distance);
        System.out.println("Потребуется дней для доставки: " + calculateTime(1000));
    }




    public static void isLeapYear(int year) {
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год невисокосный");

        }
    }
//Задача 2
public static void checkOS(int os, int clientDeviceYear) {
    int currentYear = LocalDate.now().getYear();

    if (os == 0 && clientDeviceYear < currentYear) {
        System.out.println("Облегченный ios");
    } else if (os == 0 && clientDeviceYear >= currentYear) {
        System.out.println("Обычный ios");
    }   else if (os == 1 && clientDeviceYear < currentYear) {
        System.out.println("Облегченный Android");
    } else if (os == 1 && clientDeviceYear >= currentYear) {
        System.out.println("Обычный Android");
    }
    System.out.println("Неверные данные");
}
//Задача 3
    public static int calculateTime(int distance) {
        if (distance <=20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        }
        return -1;
}}