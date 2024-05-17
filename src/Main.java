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

        int clientDeviceYear = 2015;
        clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения iOS по ссылке.");
            }

        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println("Установите облегченную версию приложения Android по ссылке.");
        }


//        task3
        System.out.println();

        int year = 2015;

        if (year % 400 == 0) {
            System.out.printf("%s год является високосным!\n", year);
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
            System.out.println("Потребуется дней : " + timeOfDelivery);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней : " + (int)(timeOfDelivery + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней : " + (int) (timeOfDelivery + 2));
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        }

//        Task5
        System.out.println();

        String season;
        String monthName;
        int monthNumber = 5;

        switch (monthNumber) {
            case 1 :
                monthName = "Январь";
                season = "Зима";
                System.out.printf("1-ый месяц %s это %s\n", monthName, season);
                break;
            case 2 :
                monthName = "Февраль";
                season = "Зима";
                System.out.printf("2-ой месяц %s это %s\n", monthName, season);
                break;
            case 3 :
                monthName = "Март";
                season = "Весна";
                System.out.printf("3-ий месяц %s это %s\n", monthName, season);
                break;
            case 4 :
                monthName = "Апрель";
                season = "Весна";
                System.out.printf("4-ый месяц %s это %s\n", monthName, season);
                break;
            case 5 :
                monthName = "Май";
                season = "Весна";
                System.out.printf("5-ый месяц %s это %s\n", monthName, season);
                break;
            case 6 :
                monthName = "Июнь";
                season = "Лето";
                System.out.printf("6-ой месяц %s это %s\n", monthName, season);
            case 7 :
                monthName = "Июль";
                season = "Лето";
                System.out.printf("7-ой месяц %s это %s\n", monthName, season);
            case 8 :
                monthName = "Август";
                season = "Лето";
                System.out.printf("8-ой месяц %s это %s\n", monthName, season);
            case 9 :
                monthName = "Сентябрь";
                season = "Осень";
                System.out.printf("9-ый месяц %s это %s\n", monthName, season);
            case 10 :
                monthName = "Октябрь";
                season = "Осень";
                System.out.printf("10-ый месяц %s это %s\n", monthName, season);
                break;
            case 11 :
                monthName = "Ноябрь";
                season = "Осень";
                System.out.printf("11-ый месяц %s это %s\n", monthName, season);
                break;
            case 12 :
                monthName = "Декабрь";
                season = "Зима";
                System.out.printf("12-ый месяц %s это %s\n", monthName, season);
                break;
            default :
                System.out.println("В году только 12 месяцев Увы!\n");
                break;
        }
    }

}