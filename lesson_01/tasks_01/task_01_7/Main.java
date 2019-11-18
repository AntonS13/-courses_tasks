package lesson_01.tasks_01.task_01_7;

import java.util.Scanner;

/*
Разработайте небольшую цельную программу, которая меняет местами
содержимое двух целочисленных переменных a и b,
не используя для этого дополнительных переменных.
 */

public class Main {
    public static void main(String[] args) {
        changeNumbers();
    }

    public static void changeNumbers() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        a = sc.nextInt();
        System.out.print("Input b: ");
        b = sc.nextInt();
        System.out.println("before changing: a = " + a + "; b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after changing: a = " + a + "; b = " + b);
        sc.close();
    }
}
