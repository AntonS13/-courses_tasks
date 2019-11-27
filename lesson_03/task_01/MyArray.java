package lesson_03.task_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int a;
    private int b;

    // создание массива
    public int[][] createArray() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] myAr = new int[a][b];
        return myAr;
    }

    // иницциализация массива
    public int[][] fillRandomValues(int[][] myAr) {
        Random r = new Random(10);
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                int randomNumber = r.nextInt(100);
                myAr[i][j] = randomNumber;
                System.out.print(randomNumber + " ");
            }
            System.out.println();
        }
        return myAr;
    }

    // найти экстремальные значения (минимальный и максимальный элементы) данной матрицы;
    public void maxElementOfArray(int[][] myAr) {
        int max = myAr[0][0];
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                max = Math.max(max, myAr[i][j]);

            }
        }
        System.out.println(max);
    }

    public void minElementOfArray(int[][] myAr) {
        int min = myAr[0][0];
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                Math.max(min, myAr[i][j]);
            }
        }
        System.out.println(min);
    }

    // найти среднеарифметическое и среднегеометрическое значения всех элементов матрицы;
    public int arifArray(int[][] myAr) {
        int sum = 0;
        int countOfit = 0;
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                sum += myAr[i][j];
                countOfit++;
            }
        }
        return sum / countOfit;
    }

    public double geomArray(int[][] myAr) {
        double s = 1.0;
        int countOfit = 0;
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                s *= myAr[i][j];
                countOfit++;
            }
        }
        return Math.pow(s, 1.0 / countOfit);
    }


}
