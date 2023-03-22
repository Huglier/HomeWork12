 public class Main {

        public static void checkYear(int yearSearch) {
            int years = yearSearch % 4;
            if (years != 0) {
                System.out.println(yearSearch + " год не является високосным");
            } else if (years == 0) {
                int yearNew = yearSearch % 100;
                if (yearNew == 0) {
                    int yearNewUp = yearSearch % 400;
                    if (yearNewUp == 0) {
                        System.out.println(yearSearch + " год является високосным");
                    } else if (yearNewUp != 0) {
                        System.out.println(yearSearch + " год не является високосным");
                    }
                } else if (yearNew != 0) {
                    System.out.println(yearSearch + " год является високосным");
                }
            }
        }

        public static void checkDevice(int clientOS, int clientDeviceYear) {
            if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
            } else if (clientDeviceYear < 2015 && clientOS == 1)
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            else if (clientOS == 0)
                System.out.println("Установите версию приложения для IOS по ссылке");
            else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        public static void searchDelivery(int search) {

            if (search <= 20) {
                int day = 1;
                System.out.println("Потребуется дней: " + day);
            } else if (search > 20 && search <= 60) {
                int day = 2;
                System.out.println("Потребуется дней: " + day);
            } else if (search > 60 && search <= 100) {
                int day = 3;
                System.out.println("Потребуется дней: " + day);
            } else {
                System.out.println("Доставки нет");
            }
        }


        public static void main(String[] args) {

            System.out.println("Задача 1");

            int year = 2021;
            checkYear(year);


            System.out.println("Задача 2");

            int clientOS = 0;
            int clientDeviceYear = 2010;
            checkDevice(clientOS, clientDeviceYear);

            System.out.println("Задача 3");

            int deliveryDistance = 95;
            searchDelivery(deliveryDistance);

        }
    }
