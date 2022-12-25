public class Main {
    public static void main(String[] args) {
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



    }}



