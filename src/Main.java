import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

        printLeapYear(2023);
    }

    public static void identifyOS (int typeTheOs, int yearOfIssue) {

        int currentYear = LocalDate.now().getYear();
        String mobileOs;
        switch (typeTheOs) {
            case 0:
                mobileOs = "iOS";
                break;
            case 1:
                mobileOs = "Android";
                break;
            default:
                mobileOs = "Неизвестная ОС";
        }

        if (yearOfIssue == currentYear) {
            System.out.println("Установите версию приложения для " + mobileOs + " по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для " + mobileOs + " по ссылке.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        identifyOS(1, 2023);
        identifyOS(0, 2021);
    }

    public static void showDeliveryDays (int deliveryDistance) {
        int daysOfDelivery = calculationOfDeliveryDays(deliveryDistance);
        if (daysOfDelivery > 0) {
            System.out.println("Срок доставки: " + daysOfDelivery);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static int calculationOfDeliveryDays (int deliveryDistance) {
        int daysOfDelivery;

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            daysOfDelivery = 1;
        } else if (deliveryDistance <= 60) {
            daysOfDelivery = 2;
        } else if (deliveryDistance <= 100) {
            daysOfDelivery = 3;
        } else {
            daysOfDelivery = -1;
        }

        return daysOfDelivery;
    }

       public static void task3 () {
        System.out.println("Задача 3");
        showDeliveryDays(10);
        showDeliveryDays(50);
        showDeliveryDays(70);
        showDeliveryDays(200);
    }
}
