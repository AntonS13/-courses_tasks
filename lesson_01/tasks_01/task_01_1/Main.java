package lesson_01.tasks_01.task_01_1;

import java.util.Scanner;

/*
Разработайте программу, которая проверяет, что числа a, b и c различны (одинаковы).
 */

public class Main {
    public static void main(String[] args) {

    chekckNumbers();

    }
    public static void chekckNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number a");
        int a = sc.nextInt();
        System.out.println("Input a number b");
        int b = sc.nextInt();
        System.out.println("Input a number c");
        int c = sc.nextInt();
        if (a != b && a != c && b != c) {
            System.out.println("Numbers are not equivalent");
        } else {
            System.out.println("Numbers are equivalent");
        }
        sc.close();
    }

}
