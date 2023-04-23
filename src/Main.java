import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int year = 2021;
        printLeapYear(year);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int currentYear = LocalDate.now().getYear();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение соответствующее вашей ОС: 0 - iPhone, 1 - Android ");
        int operationSystem = scanner.nextInt();

        System.out.println("Введите год выпуска Вашего устройства");
        String yearOfIssue = scanner.next();

        if (operationSystem == 0) {
            if () {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

    }
}