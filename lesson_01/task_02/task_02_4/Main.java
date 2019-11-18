package lesson_01.task_02.task_02_4;

import java.util.Scanner;

/*
Заданы три целых числа, которые задают некоторую дату по Грегорианскому календарю. Определить дату следующего дня.
Запрещается использовать типы стандартной библиотеки языка для работы с датой и временем.
Также необходимо учесть то, что по григорианскому календарю (используется в настоящий момент)
високосный год определяется следующим образом:
- годы, кратные 4 – високосные (например, 2008, 2012, 2016);
- годы, кратные 4 и 100 – невисокосные (например, 1700, 1800, 1900);
- годы, кратные 4, 100 и 400 – високосные (например, 1600, 2000, 2400).
 */

public class Main {
    public static void main(String[] args) {
        nextDay();
    }

    public static void nextDay() {
        int day, month, year, last;
        System.out.print("Input date (day, month, year): ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        last = 0;

        if (month == 2) {
            if ((year % 4) != 0 && day == 28) {
                last = 1;
            }
            if ((year % 4) == 0 && day == 29) {
                last = 1;
            }
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            month++;
            day = 0;
        } else if (day == 31) {
            last = 1;
        }

        if (last == 1) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            }
            else
                month++;
        }
        else
            day++;
        System.out.println("Next day is " + day + "."+ month + "."+ year + "");

    }
}
