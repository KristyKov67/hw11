public class Main {
    public static void main(String[] args) {
        printGetYear(2024);


    }
    public static boolean getYear(int year) {
        return (((year % 4 != 0) || (year % 400 != 0)) && (year % 100 == 0));
    }

    public static void printGetYear(int year) {
        if (getYear(year)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }



    }}