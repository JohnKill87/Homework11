public class Main {

    public static void countingLeapYears(int count) {
        if ((count % 4 == 0 && count % 100 != 0) || count % 400 == 0) {
            System.out.println(count + " год является високосным");
        } else {
            System.out.println(count + " год не является високосным");
        }
    }
    public static void clientOSCount(int number, int year) {
        int iOS = 0;
        int android = 1;
        if (number == android && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (number == android && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (number == iOS && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (number == iOS && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int daysTime(int number) {
        int daysTime = 0;
        if (number <= 20) {
            return  1;
        } else if (number >= 20 && number <= 60){
            return  2;
        } else if (number >= 60 && number <= 100) {
            return  3;
        } else {
            System.out.println("Доставки нет");
        }
        return daysTime;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        countingLeapYears(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2023;
        int clientOS = 1;
        clientOSCount(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDaysTime = daysTime(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDaysTime);
    }
}