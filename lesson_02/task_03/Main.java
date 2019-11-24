package lesson_02.task_03;

import java.util.Scanner;

/*
Натуральное число называют совершенным, если оно равно сумме всех своих делителей,
не считая только его самого (например, 28=1+2+3+7+14 – совершенное число).
Напишите программу, которая проверяет, является ли введённое натуральное число совершенным.
Для проверки работоспособности программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int x = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            if (isPerfect(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;
        return false;
    }
}