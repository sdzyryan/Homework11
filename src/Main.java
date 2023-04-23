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

    }
}