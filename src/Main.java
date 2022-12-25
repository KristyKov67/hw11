public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("Задание 2");
        task2(0, 2020);
        task2(1, 2022);
        task2(0, 2010);
        task2(1, 2009);

    }


    public static void task1() {
        System.out.println("Задание 1");
        printGetYear(2020);
        printGetYear(2021);
        printGetYear(2022);
        printGetYear(2023);
        printGetYear(2024);

    }

    public static boolean getYear(int year) {
        boolean otvet = year % 4 != 0 || year % 400 != 0 && year % 100 == 0;
        return otvet;
    }

    public static void printGetYear(int years) {
        if (getYear(years)) {
            System.out.println(years + "год невысокосный");
        } else {
            System.out.println(years + "год высокосный");
        }


    }

    public static void task2(int os, int years) {
        String yearsOS = printLite(years);
        String version = printOS(os);
        System.out.println(yearsOS + version);
    }


    public static String printOS(int os) {
        String name = "для IOS";
        String name2 = "для Android";
        if (os == 0) {
            return name;
        } else {
            return name2;
        }

    }


    public static String printLite(int years) {
        if (years <= 2015) {
            return "Нужна облегченная версия ";
        } else {
            return "Нужна стандартная версия ";
        }


    }


}




