package lesson_01.tasks_01.task_01_2;

import java.util.Scanner;

/*
Масса динозавра задаётся в килограммах. Разработайте программу, которая вычисляет, сколько это миллиграмм, грамм и тонн.
 */

public class Main {
    public static void main(String[] args) {
        dinosaurMassCount();
    }

    public static void dinosaurMassCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input dinosaur mass");
        double count = sc.nextDouble();
        System.out.println("The mass of a dinosaur is " + (count * 1000000) + " milligrams");
        System.out.println("The mass of a dinosaur is " + (count * 1000) + " grams");
        System.out.println("The mass of a dinosaur is " + (count * 0.001) + " tons");
    }
}
