public class Main {
    public static void main(String[] args) {
//        task1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//        task2
        System.out.println();

        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения iOS по ссылке.");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения Android по ссылке.");
            }
        }

//        task3
        System.out.println();

        int year = 2025;

        if (year % 400 == 0) {
            System.out.printf("%s год является високосным!\n", year);
        }
        else if (year % 100 == 0) {
            System.out.printf("%s год не является високосным\n", year);
        }
        else if ((year % 4 == 0) && year > 1584) {
            System.out.printf("%s год является високосным!\n", year);
        }
        else {
            System.out.printf("%s год не является високосныи\n", year);
        }

//        task4
        System.out.println();

        int deliveryDistance = 95;
        int timeOfDelivery = 1;
//        Можно и добавить объявление переменной timeOfDelivery в каждом результате if-а, но я решил попробовать так
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней : " + timeOfDelivery);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуется дней : " + (int)(timeOfDelivery + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется дней : " + (int) (timeOfDelivery + 2));
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        }

//        Task5
        System.out.println();

        String season = null;
        String monthName;
        int monthNumber = 5;

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            season = "Зима";
        }
        else if (monthNumber > 2 && monthNumber < 6) {
            season = "Весна";
        }
        else if (monthNumber > 5 && monthNumber < 9) {
            season = "Лето";
        }
        else if (monthNumber > 8 && monthNumber < 12) {
            season = "Осень";
        }

        switch (monthNumber) {
            case 1 :
                monthName = "Январь";
                System.out.printf("1-ый месяц %s это %s", monthName, season);
                break;
            case 2 :
                monthName = "Февраль";
                System.out.printf("2-ой месяц %s это %s", monthName, season);
                break;
            case 3 :
                monthName = "Март";
                System.out.printf("3-ий месяц %s это %s", monthName, season);
                break;
            case 4 :
                monthName = "Апрель";
                System.out.printf("4-ый месяц %s это %s", monthName, season);
                break;
            case 5 :
                monthName = "Май";
                System.out.printf("5-ый месяц %s это %s", monthName, season);
                break;
            case 6 :
                monthName = "Июнь";
                System.out.printf("6-ой месяц %s это %s", monthName, season);
            case 7 :
                monthName = "Июль";
                System.out.printf("7-ой месяц %s это %s", monthName, season);
            case 8 :
                monthName = "Август";
                System.out.printf("8-ой месяц %s это %s", monthName, season);
            case 9 :
                monthName = "Сентябрь";
                System.out.printf("9-ый месяц %s это %s", monthName, season);
            case 10 :
                monthName = "Октябрь";
                System.out.printf("10-ый месяц %s это %s", monthName, season);
                break;
            case 11 :
                monthName = "Ноябрь";
                System.out.printf("11-ый месяц %s это %s", monthName, season);
                break;
            case 12 :
                monthName = "Декабрь";
                System.out.printf("12-ый месяц %s это %s", monthName, season);
                break;
            default :
                System.out.println("В году только 12 месяцев Увы!");
                break;
        }
    }

}