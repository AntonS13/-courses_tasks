package lesson_01.tasks_01.task_01_4;

/*
Разработайте программу, которая проверяет, что цифры четырёхзначного числа N
образуют возрастающую (убывающую) последовательность (к примеру, число 1357 удовлетворяет условию,
т.к. его цифры соответствуют следующему неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ckeckNumbers();
    }

    public static void ckeckNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input four-digit number: ");
        int n = sc.nextInt();
        if((n / 1000 < (n % 1000) / 100) && ((n % 1000) / 100 < (n % 100) / 10) && ((n % 100) / 10 < n % 10)) {
            System.out.println("This is increasing sequence");
        } else if((n / 1000 > (n % 1000) / 100) && ((n % 1000) / 100 > (n % 100) / 10) && ((n % 100) / 10 > n % 10)) {
            System.out.println("This is descending sequence");
        } else {
            System.out.println("This is  not increasing sequence or descending sequence");
        }
        sc.close();
    }
}
