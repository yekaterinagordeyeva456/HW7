public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1 ");
        int initial = 15_000;
        int target = 2_459_000;
        int deposit = 0;
        int month = 0;
        while (deposit < target) {
            deposit += initial;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений = " + deposit + " руб.");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 11;
        while (number > 0) {
            number = number - 1;
            System.out.print(" " + number + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year += 1;
            population += population * 1.017 - population * 1.008;
            System.out.println("Год " + year + " численность населения составляет " + population + " человек");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        float deposit = 15_000;
        float target = 12_000_000;
        int month = 0;
        while (deposit <= target) {
            deposit *= 1.07;
            month += 1;
            System.out.printf("Месяц: " + month + " - сумма депозита, руб = %.2f", deposit);
            System.out.println();
        }
        System.out.println();
        System.out.println("общее кол-во месяцев: " + month);
        System.out.printf("Общая сумма,руб = %.2f", deposit);
        {
        }
        System.out.println();
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        float deposit = 15_000;
        float target = 12_000_000;
        int month = 0;
        while (deposit <= target) {
            deposit *= 1.07;
            month += 1;
            if (month % 6 == 0) {
                System.out.printf("Месяц: " + month + " - сумма депозита, руб = %.2f", deposit);
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("общее кол-во месяцев: " + month);
        System.out.printf("Общая сумма,руб = %.2f", deposit);
        {
        }
        System.out.println();
        System.out.println();
    }


    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15_000;
        double year = 9;
        double month = 0;
        while (month < 9 * 12) {
            deposit *= 1.07;
            month += 1;
            year = month / 12;
            if (month % 6 == 0) {
                System.out.printf("Год: %.1f ", year);
                System.out.printf("Общая сумма,руб = %.2f", deposit);
                System.out.println();
            }
        }
        System.out.println();
        System.out.printf("общее кол-во лет: %.0f ", year);
        System.out.println();
        System.out.printf("Общая сумма,руб = %.2f", deposit);
        {
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        int dayPerMonth = 31;
        for (int i = friday; i <= dayPerMonth; i += 7) {
            System.out.println("Сегодня пятница " + i + " число");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int lowLimitYear = currentYear - 200;
        int upperLimitYear = currentYear + 100;
        for (int i = 0; i < upperLimitYear; i += 79) {
            if (i > lowLimitYear && i < upperLimitYear) {
                System.out.println(i);
            }
        }
    }
}

