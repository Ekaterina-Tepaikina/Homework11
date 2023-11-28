public class Main {
    public static void determineLeapYear (short year) {
        if (year < 1585) {
            System.out.println("Високосный год ещё не ввели");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void determineMessage (byte clientOS, short clientDeviceYear) {
        int currentYear = 2023;
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void determineDeliveryTime (short deliveryDistance) {
        if (deliveryDistance < 21) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance < 61) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        short year = 2021;
        determineLeapYear(year);
        byte clientOS = 1;
        short clientDeviceYear = 2015;
        determineMessage(clientOS, clientDeviceYear);
        short distance = 95;
        determineDeliveryTime(distance);
    }
}