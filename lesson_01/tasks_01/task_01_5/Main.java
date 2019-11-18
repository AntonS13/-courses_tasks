package lesson_01.tasks_01.task_01_5;

import java.util.Arrays;
import java.util.Scanner;

/*
Написать программу, которая находит арифметическое и геометрическое среднее цифр шестизначного числа N.
 */

public class Main {
    public static void main(String[] args) {
        arithmeticGeometricMean(getMasOfNumbers());
    }

    public static int[] getMasOfNumbers() {
        int[] sixDigitNumber = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sex-digit number: ");
        int n = sc.nextInt();
        for(int i = 0; i < sixDigitNumber.length; i++) {
            sixDigitNumber[i] = n % 10;
            n /= 10;
        }
        sc.close();
        return sixDigitNumber;
    }

    public static void arithmeticGeometricMean(int[] m) {
        int[] mas = m;
        double a = 0;
        double g = 1.0;
        if (mas.length > 0)
        {
            double s = 0;
            for (int i = 0; i < mas.length; i++) {
                s += mas[i];
            }
            a = s / mas.length;
        }
        System.out.println("Arithmetic mean is " + a);
        for (int i = 0; i < mas.length; i++) {
            g *= mas[i];
        }
        g = Math.pow(g, 1.0/(double) mas.length);
        System.out.println("Geometric mean is " + g);

    }
}
