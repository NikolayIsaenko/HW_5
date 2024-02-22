public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1");

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача 2
        System.out.println(" Задача 2");

        int clientDeviceYear = 2016;
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // Задача 3
        System.out.println(" Задача 3");

        int year = 2020;
        boolean yeapLearYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year < 1584 );
        if (yeapLearYear) {
            System.out.println(year + " - Год является високосным");
        } else {
            System.out.println(year + " - Год не високосный");
        }
        // Задача 4
        System.out.println(" Задача 4");
        int deliveryDistance = 110;
        if (deliveryDistance < 20) {
            System.out.println("Потребуются сутки на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется двое суток на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println(" Потребуются трое суток на доставку");
        } else {
            System.out.println(" Доставка невозможна");
        }
        // Задача 5
        System.out.println(" Задача 5");
        int monthNumber = 4;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет больше вариантов");
        }}
    }
