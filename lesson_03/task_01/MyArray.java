package lesson_03.task_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray<myAr> {
    private int a;
    private int b;

    // создание массива
    public int[] createArray() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] myAr = new int[a];
        return myAr;
    }

    // создание массива
    public int[][] createMultArray() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] myAr = new int[a][b];
        return myAr;
    }

    // инициализация массива
    public int[] fillRandomValuesArray(int[] myAr) {
        Random r = new Random();
        for (int i = 0; i < myAr.length; i++) {
            int randomNumber = r.nextInt(100);
            myAr[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        return myAr;
    }

    // инициализация массива
    public int[][] fillRandomValuesMultArray(int[][] myAr) {
        Random r = new Random();
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

    // это элемент, который меньше любого из своих соседей;
    // локальный максимум – это элемент, который больше любого из своих соседей)
    public void maxElem(int[] myAr) {
        for(int i = 1; i < myAr.length - 1; i++) {
            if(myAr[i] > myAr[i - 1] && myAr[i] > myAr[i + 1]) {
                System.out.println(myAr[i]);
            }
        }
    }

    public void minElem(int[] myAr) {
        for(int i = 1; i < myAr.length - 1; i++) {
            if(myAr[i] < myAr[i - 1] && myAr[i] < myAr[i + 1]) {
                System.out.println(myAr[i]);
            }
        }
    }

    // транспонировать матрицу
    public void transpArray() {
        Random r = new Random();
        int[][] myAr = new int[2][2];
        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                int randomNumber = r.nextInt(10);
                myAr[i][j] = randomNumber;
                System.out.print(randomNumber + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < myAr.length; i++) {
            for (int j = i + 1; j < myAr.length; j++) {
                int temp = myAr[i][j];
                myAr[i][j] = myAr[j][i];
                myAr[j][i] = temp;
            }
        }

        for (int i = 0; i < myAr.length; i++) {
            for (int j = 0; j < myAr[i].length; j++) {
                int randomNumber = r.nextInt(10);
                System.out.print(myAr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
